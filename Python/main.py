class Being:
    def __init__(self, name):
        # A private variable that requires methods to access it.
        self.__name = name

    def say_hi(self):
        return "Hello I am {}".format(self.__name)

    # Providing access to private variables using encapsulation
    def get_name(self):
        return self.__name

    def set_name(self, name):
        self.__name = name


# Placing a parent class in the () the child class Human inheritances Being
class Human(Being):
    pass


# Placing a parent class in the () the child class Cyborg inheritances Being
class Cyborg(Being):
    # Using polymorphism to transform say_hi() to return a different string other than the one using inheritance.
    def say_hi(self):
        return "Greetings I am a cyborg named {}".format(self.get_name())

    pass


Wyl = Human("Wyl")
Vision = Cyborg("Vision")

print(Wyl.say_hi())
print(Vision.say_hi())
Wyl.set_name("William")
print(Wyl.say_hi())
