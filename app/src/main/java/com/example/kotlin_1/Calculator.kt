
    fun main() {
    println("메이드바이리안계산기")

    println("첫번째숫자를입력하세요")
    val num1 = readLine()!!.toInt()
    println("연산자를입력해주세요")
    val operator = readLine()!!
    println("두번째 숫자를 입력해주세요")
    val num2 = readLine()!!.toInt()

    if("+-*/".contains(operator)){
        calculate(num1,num2,operator)
        displayInfo(num1,num2,operator,answer)
    }else {
        println("잘못된 연산자입니다")
    }



}
    fun displayInfo(num1: Int, num2: Int, operator: String, answer : Int){
        println("계산 결과")
        println("입력식$num1 $operator $num2")
        println("답: $answer")
    }

    var answer : Int = 0
    val calculator = Calculator()

    fun calculate(num1: Int, num2: Int, operator: String) : Int {

        for (i in operator) {
            answer = when (operator) {
                "+" -> calculator.add(num1, num2)
                "-" -> calculator.substract(num1, num2)
                "*" -> calculator.multiply(num1, num2)
                "/" -> calculator.divide(num1, num2)
                else -> -1
            }
        }
        return answer
    }



    class Calculator() {
        fun add (num1 : Int , num2 : Int) = num1 + num2

        fun substract (num1 : Int, num2 : Int) = num1 - num2

        fun multiply (num1 : Int , num2 : Int ) = num1 * num2

        fun divide (num1 : Int , num2 : Int) = num1 / num2

    }



