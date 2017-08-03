package testgrailsfieldspluginwar

class Author {
    String name
    BigInteger age

    static constraints = {
        name blank: false
        age  nullable: false
    }

}
