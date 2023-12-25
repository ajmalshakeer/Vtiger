package String_problome;

public class Vtigermain {
    public static void main(String[] args) {
        String words = "Vtiger CRM is a customer relationship management(CRM) software designed to enhance business operations.";
        int maxLength = 40;
        
        Vtiger_function obj = new Vtiger_function();
        
        String FormattedString = obj.centralizeString(words, maxLength);
        System.out.println(FormattedString);
    }
}