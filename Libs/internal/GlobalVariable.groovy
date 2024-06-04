package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object apkUrl
     
    /**
     * <p></p>
     */
    public static Object validUsername
     
    /**
     * <p></p>
     */
    public static Object validPassword
     
    /**
     * <p></p>
     */
    public static Object firstName
     
    /**
     * <p></p>
     */
    public static Object lastName
     
    /**
     * <p></p>
     */
    public static Object postal
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            apkUrl = selectedVariables['apkUrl']
            validUsername = selectedVariables['validUsername']
            validPassword = selectedVariables['validPassword']
            firstName = selectedVariables['firstName']
            lastName = selectedVariables['lastName']
            postal = selectedVariables['postal']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
