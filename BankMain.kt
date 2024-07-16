package `Android 14 Course kotlin fundamentals`



fun main(){

    val vishuBankAccount = BankAccount("Vishu Tyagi", 1338.20)

    vishuBankAccount.deposit(200.0)
  vishuBankAccount.withdraw(1200.00)
   vishuBankAccount.deposit(3000.00)
   vishuBankAccount.deposit(2000.00)
    vishuBankAccount.withdraw(3333.15)

   vishuBankAccount.displayTransactionHistory()
    println("${vishuBankAccount.accountHolder}'s " +
            "balance is ${vishuBankAccount.balance}")

}