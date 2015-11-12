/*powered by @ng310 1uc1@n1*/

/***************************************** LOCAL VARIABLE *************************************************************************/
def x = 81
def firstName = "Angelo"
def surname = "Luciani"
def list = [1,1,2,3,5]

//multiline strings
def s = """This is
a multiline
string"""

//8 Regular expression
 def pattern = ~/a slash must be escaped \/ but backslash, like in a digit match \d does not/
 
/*****************************************  PROCEDURE    *************************************************************************/         
 
 def helloWorld = {
  println "Hello World"
}

//parameters
def power = { int b, int y ->
  return Math.pow(b, y)
}

def say = { what ->
  println what
}



/*****************************************      MAIN     *************************************************************************/

//1. print in java style
System.out.println("Hello from Angelo Luciani");

//2. dynamic typing
println x.getClass()
//override with a different type
x = "Hello World"
println x.getClass()

//3. string interpolation
x = "World"
println "Hello, $x"

//4. array
println "Hello, ${firstName[0]}. $surname"

//5. special character
println '$'

//6. multiline strings
println "$s"

//7 Implicit Truthy

//8 Regular expression
println pattern.getClass()

//8.1 Use regular espression
def matcher = "The Hitchhiker's guide to the Galaxy" =~ /Galaxy/
if (matcher) 
{
println "Found the word 'Galaxy'"
}

//8.2 
def m = "Angelo is angelo" =~ /(A|a)ngelo/
println m[0][0] // The first whole match (i.e. the first word Groovy)
println m[0][1] // The first group in the first match (i.e. G)
println m[1][0] // The second whole match (i.e. the word groovy)
println m[1][1] // The first group in the second match (i.e. g)

//8.3 Avoid null exception eith the ? operator
//if(company.getContact()?.getAddress()?.getCountry() == Country.NEW_ZEALAND) { }


//9 Elvis operator def name = client.getName() != null ? client.getName() : ""
//Why is this called the Elvis Operator? Turn your head around and look at the smileys hair.
//def name = client.getName() ?: ""

//10 anonymus block
helloWorld()

//11 procedure with parameters
println power(2, 3)
//11.2
say "maneki neko"

//12 Passing Closures around
def transform = { str, transformation ->
  transformation(str)
}
println transform("Angelo Luciani", { it.toUpperCase() })

println transform("Hello World", { it.toUpperCase() })

//14 lIST
println list[0] // will print 1
println list[-1] // negative indexes for access from the end of the list, will print out 5
if (3 in list) 
{
println "TROVATO"
} 


//14.1 lIST
list.each {
  println it
}
//14.2 lIST
def even = list.findAll { it % 2 == 0 }
//14.3 lIST
def squaredList = list.collect { it * it }

//mapS
//similar switch

def key = 'Key3'
def aMap = [
  'Key1': 'Value 1', // Put key1 -> Value 1 to the map
  Key2: 'Value 2', // You can also skip the quotes, the key will automatically be a String
  (key): 'Another value' // If you want the key to be the value of a variable, you need to put it in parantheses
]

println aMap['Key1'] // Access the key Key1
println aMap[key] // Access the entry with the value of key variable


println aMap.Key1 // Access Key1 entry

//Trasforming and filtering
map.each {
  println it.key
  println it.value
}


map.each { key, value ->
  println key
  println value
}






















