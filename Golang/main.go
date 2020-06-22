package main

import "fmt"

type Being struct{
name string
}

type Human struct{
//Inherent the being type or embeding a type
Being
}

type Cyborg struct{
//Inherent the being type or embeding a type
Being
}

func (b Being) sayHi() string {
  return "Hello I am " + b.name
}

//Polymorphism is used to change the sayHi() method
func (c Cyborg) sayHi() string {
  return "Greetings I am a cyborg name " + c.name
}

//An interface used for abstraction
type talk interface{
  sayHi() string
}


//setter for changing a private variable
func (b *Being) setName (name string){
  b.name = name
}

//getter for return a private variable
func (b Being) getName () string {
  return b.name
}

func main() {
  Wyl := Human{Being{"Wyl"}}
  fmt.Println(talk.sayHi(Wyl))
  Vision := Cyborg{Being{"Vision"}}
  fmt.Println(talk.sayHi(Vision))
  Wyl.setName("William")
  fmt.Println("Wyl's name has changed to", Wyl.getName())
}