
    val ADD: String = "+"
    val SUBTRACT = "-"
    val MULTIPLY = "*"
    val DIVIDE = "-"

    val ERROR_MESSAGE = "An error has occured."

    //create two test operands to see if our program works properly
    val testOperandONe: Double = 5.0
    val testOperandTwo  = 4.0
fun main(args: Array<String>){
    val operatorSymbol = args[0]

    start(operatorSymbol)
}
    fun start(operatorSymbol: String){
        if (checkArguments(operatorSymbol)){
            evaluateBinomial(testOperandONe,testOperandTwo,operatorSymbol)
        }
    }

    fun evaluateBinomial(testOperandONe: Double, testOperandTwo: Double, operatorSymbol: String) {

    }

    
    //Returns true or false (Boolean), based on it the operator matches our constatants
    fun checkArguments(operatorSymbol: String): Boolean {
       return when(operatorSymbol){
            //equals
            ADD -> true
            SUBTRACT -> true
            MULTIPLY -> true
            DIVIDE -> true
            else -> false
        }

    }
