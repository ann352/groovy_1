package dataTypes

class Account {
    BigDecimal balance

    Account plus(Account otherAccount) {
        new Account(balance: this.balance + otherAccount.balance)
    }
    String toString(){
        "Account Balance: $balance"
    }
}

