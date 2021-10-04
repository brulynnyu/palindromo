import org.junit.Test;
import org.junit.Assert;

public class PalindromoTest {

 
    @Test
    public void verdadeiroRotator() {
        Palindromo p = new Palindromo();
        
        boolean resultado = p.verifyPalindromo("Rotator");
        Assert.assertTrue(resultado);
        System.out.printf("Rotator: " + resultado + "\n");
    }
    
    @Test
    public void verdadeiroBob() {
        Palindromo p = new Palindromo();
        
        boolean resultado = p.verifyPalindromo("bob");
        Assert.assertTrue(resultado);
        System.out.printf("bob: " + resultado + "\n");
    }
    
    @Test
    public void verdadeiroMadam() {
        Palindromo p = new Palindromo();
        
        boolean resultado = p.verifyPalindromo("madam");
        Assert.assertTrue(resultado);
        System.out.printf("madam: " + resultado + "\n");
    }   
    
    @Test
    public void verdadeiroMAIAyAlam() {
        Palindromo p = new Palindromo();
        
        boolean resultado = p.verifyPalindromo("mAlAyAlam");
        Assert.assertTrue(resultado);
        System.out.printf("mAIAyAlam: " + resultado + "\n");
    } 
    
    @Test
    public void verdadeiro1() {
        Palindromo p = new Palindromo();
        
        boolean resultado = p.verifyPalindromo("1");
        Assert.assertTrue(resultado);
        System.out.printf("1: " + resultado + "\n");
    }     

    @Test
    public void verdadeiroAbleWasIEreISawElba() {
        Palindromo p = new Palindromo();
        
        boolean resultado = p.verifyPalindromo("Able was I, ere I saw Elba");
        Assert.assertTrue(resultado);
        System.out.printf("Able was I, are I saw Elba: " + resultado + "\n");
    }   
    
    @Test
    public void verdadeiroMadamImAdam() {
        Palindromo p = new Palindromo();
        
        boolean resultado = p.verifyPalindromo("Madam I'm Adam");
        Assert.assertTrue(resultado);
        System.out.printf("Madam I'm Adam: " + resultado + "\n");
    }  
    
    @Test
    public void verdadeiroStepOnNoPets() {
        Palindromo p = new Palindromo();
        
        boolean resultado = p.verifyPalindromo("Step on no pets.");
        Assert.assertTrue(resultado);
        System.out.printf("Step on no pets.: " + resultado + "\n");
    }    
    
    @Test
    public void verdadeiroTopSpot() {
        Palindromo p = new Palindromo();
        
        boolean resultado = p.verifyPalindromo("Top spot!");
        Assert.assertTrue(resultado);
        System.out.printf("Top spot!: " + resultado + "\n");
    } 
    
    @Test
    public void verdadeiro02022020() {
        Palindromo p = new Palindromo();
        
        boolean resultado = p.verifyPalindromo("02/02/2020");
        Assert.assertTrue(resultado);
        System.out.printf("02/02/2020: " + resultado + "\n");
    }     
     
    
    @Test
    public void falsoXYZ() {
        Palindromo p = new Palindromo();
        
        boolean resultado = p.verifyPalindromo("xyz");
        Assert.assertFalse(resultado);
        System.out.printf("xyz: " + resultado + "\n");
    } 
    
    @Test
    public void falsoElephant() {
        Palindromo p = new Palindromo();
        
        boolean resultado = p.verifyPalindromo("elephant");
        Assert.assertFalse(resultado);
        System.out.printf("elephant: " + resultado + "\n");
    }   
    
    @Test
    public void falsoCountry() {
        Palindromo p = new Palindromo();
        
        boolean resultado = p.verifyPalindromo("Country");
        Assert.assertFalse(resultado);
        System.out.printf("Country: " + resultado + "\n");
    }    
    
    @Test
    public void falsoTopPost() {
        Palindromo p = new Palindromo();
        
        boolean resultado = p.verifyPalindromo("Top . post!");
        Assert.assertFalse(resultado);
        System.out.printf("Top . post!: " + resultado + "\n");
    }    
    
    
    @Test
    public void falsoWonderfulFool() {
        Palindromo p = new Palindromo();
        
        boolean resultado = p.verifyPalindromo("Wonderful-fool");
        Assert.assertFalse(resultado);
        System.out.printf("Top . post!: " + resultado + "\n");
    }     

    @Test
    public void falsoWildImagination() {
        Palindromo p = new Palindromo();
        
        boolean resultado = p.verifyPalindromo("Wild imagination!");
        Assert.assertFalse(resultado);
        System.out.printf("Wild imagination!: " + resultado + "\n");
    } 

}