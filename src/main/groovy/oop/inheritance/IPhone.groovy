package oop.inheritance

@groovy.transform.ToString()
class IPhone extends Phone{
    //when we need methods specific only for IPhone class we can just add them
    def getIOSversion(){

    }

    @Override //when we want to to change some beaviour of objects in IPhone class, we can do it by @override annotation
    def powerOn() {
        return super.powerOn()
    }
}
