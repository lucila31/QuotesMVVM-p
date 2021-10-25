import org.junit.Test
import java.time.LocalDate
import kotlin.test.assertIs

class PersonaTest {
    @Test
    fun testPersona(){
        var alumno:Persona= Alumno(numeroControl="17920442" ,fechaIngreso= LocalDate.of(2016,1,2), curp="RIVS970301HTSVZL05",
            nombre = "SALOME RIVERA VASQUEZ")

        var personal:Persona= Personal(curp="ORE610611MTSLMM04",
            nombre = "EMMA PAULA SOLIS RAMIREZ", rfc = "ORE610611XX")

        assertIs<Persona>(alumno)
    }

}
