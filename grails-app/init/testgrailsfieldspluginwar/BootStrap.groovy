package testgrailsfieldspluginwar

class BootStrap {

    def init = { servletContext ->
        new Author(name: 'Nassim Nicholas Taleb', age:56).save()
        new Author(name: 'Ayn Rand', age:77).save()
    }
    def destroy = {
    }
}
