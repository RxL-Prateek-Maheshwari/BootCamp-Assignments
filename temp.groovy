// List a = [1,2,3,4,5,6,7]
// List b = [1,3,6]

// List mails = [
//     "ammar@gmail.com",
//     "prateek@gmail.com",
//     "temp@gmail.com",
// ]

// for(mail in mails){
//     println((mail.tokenize("@")[1]).tokenize(".")[0]);
// }

// class Student{
//     def name,age;
// }

// Student s1 = new Student(name:"Jack",age:20);
// Student s2 = new Student(name:"Mark",age:22);
// List l1 = [s1,s2]
// println l1.age

// def sqSum1 = l1.sum{
//     1
// }

// print sqSum1

// list2 = [-1,-2,-4,5,6,-13,11];

// print list2.max()

// print list2.max{
//     x,y -> Math.abs(x)==Math.abs(y)?0:Math.abs(x)>Math.abs(y)?1:-1; 
// }

// r = 1..10
// print "${r}"
// print r.from
// print r.class


Map m = [1:'abc',2:'bcd'];
// print m.getClass() 
// m.put(3,'Yellow')
// m.put(0,'white')
// m[5] = 'brown'
// m.each{
//     key,value -> println "${key}:${value}"
// }
// m.eachWithIndex{
//     key,value,index -> println "${index}:${key}-->${value}"
// }

// Map m5 = null
// print m5.getClass()

// println m.toMapString()[0..10]

int i =1,j=1;

println i==j