import org.junit.Assert;
import org.junit.Test;

public class NameInverterTest {
    @Test
    public void testnameInv(){
        Assert.assertEquals("Stoica, Iulia",NameInverter.nameInv("Iulia Stoica  "));
        Assert.assertEquals("Stoica, Iulia Mrs.",NameInverter.nameInv("Mrs. Iulia Stoica  "));
        Assert.assertEquals("Stoica, Iulia Mrs. PhD.",NameInverter.nameInv("  Mrs. PhD. Iulia Stoica  "));
        Assert.assertEquals("Stoica",NameInverter.nameInv(" Stoica  "));
        Assert.assertEquals("",NameInverter.nameInv(""));
    }

    @Test
    public void testnotnameInv(){
        Assert.assertNotEquals("Iulia",NameInverter.nameInv("Iulia Stoica  "));
        Assert.assertNotEquals("Stoica",NameInverter.nameInv("  Iulia Stoica Mrs.  "));
        Assert.assertNotEquals("Iulia, Stoica",NameInverter.nameInv("Iulia Stoica  "));
        Assert.assertNotEquals("Mrs. Stoica, Iulia",NameInverter.nameInv("Iulia Stoica Mrs. "));
    }
}
