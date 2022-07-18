// // Q1

// List l1 = [];
// l1[11] = "myelement"
// println l1[11]
// println l1.get(5)
// println l1;


// // Q2

// List ls = (0..10)
// println ls.findAll{
//     it % 2==0
// }

// // Q3

// List ls = [1,1,2,3,4,5,6,4,5]
// lset = ls as Set
// println lset

// // Q4

// List l1 = [11,12,13,14]
// List l2 = [13,14,15]

// println l1-l2

// Q5

// List l1 = (0..10)
// List l2 = []
// l1.eachWithIndex{
//     p,index -> if(index%2!=0){l2.add(p)} 
// }
// println l1-l2;

// Q6

// List l1 = [1,2,3,"element1",0.3,[2,4,6],0..10]

// l1.each{
//     println "${it} : ${it.getClass()}"
// }

// println l1.get(6).get(9)

// Q7

// List l1 = [14,12,11,10,16,15,12,10,99,90,14,16,35];

// print l1.unique().sort()

// Q8

// class Employee{
//     def name,age,salary;
// }

// Employee emp1 = new Employee(name:'Ram',age:20,salary:2000)
// Employee emp2 = new Employee(name:'Gopal',age:22,salary:4000)
// Employee emp3 = new Employee(name:'Sid',age:25,salary:7000)
// Employee emp4 = new Employee(name:'Murti',age:24,salary:9000)
// Employee emp5 = new Employee(name:'Ranga',age:22,salary:6000)
// Employee emp6 = new Employee(name:'Jaggu',age:21,salary:15000)
// Employee emp7 = new Employee(name:'Jackie',age:27,salary:7500)
// Employee emp8 = new Employee(name:'Vijay',age:30,salary:9500)
// Employee emp9 = new Employee(name:'Virat',age:19,salary:4500)
// Employee emp10 = new Employee(name:'Bhuvi',age:29,salary:8000)

// l1 = [emp1,emp2,emp3,emp4,emp5,emp6,emp7,emp8,emp9,emp10]
// println l1.findAll{
//     it.salary < 5000
// }.name

// print l1.min{
//     it.age;
// }.name

// print l1.max{
//     it.age;
// }.name

// l1.each{
//     print " *$it.name*"
// }


// Q9 

// String s = "are.you.trying.to.split.me.mister?"
// String s ="Hello World"
// // println s.tokenize(".")
// println s.split(".")

// here split(".") returns nothing as . in regex means any character.

// Q10

// Range r = 1..10
// println "${r.from} => ${r.get(1)} => ${r.to}" 

// Q11

// println "${(1..10).collect{it.multiply(2)}}"
// println "${(1..10).collect{it.multiply(12)}}"

// Q13

// String s ="abcabcac"

// def m = [:]

// for(int i=0;i<s.size();i++){
//     if(m.containsKey(s[i])){
//         m[s[i]]++
//     }else{
//         m[s[i]] = 1;
//     }
// }

// println m['b'];

// Q14



// (1..100).each{
//     if(it%3==0 && it%5==0){
//         print "FizzBuzz "
//     }else if(it%5==0){
//         print "Buzz " 
//     }else if(it%3==0){
//         print "Fizz "
//     }else{
//         print "${it} "
//     }
// }


// Q15

// class Stack{
//     static List ls = [];

//     public static pop(def x){
//         ls.p
//     }

// }

// Q16 , Q17

// def m = [
//     'Ammar' : 20,
//     'Saif' : 21,
//     'Ashish' : 21,
//     'Prateek' : 20,
//     'Rachit' : 22,
//     'Yatarth' : 22,
//     'Aadarsh' : 22,
//     'Utkarsh' : 22,
//     'Devang' : 20,
//     'Sparsh' : 22,
// ]

// m.each{
//     key,value -> println "${key} : ${value}"
// }

// m.collect{
//     key,value -> println "${key} : ${value}"
// }

// m.eachWithIndex{
//     key,value,index -> println "${key} : ${value}"
// }

// for(def i: m.keySet()){
//     println "${i} : ${m[i]}"
// }

// Q18

// def m1 = [1:'A',2:'B']
// def m2 = [4:'C',3:'D']

// def m3 = m1+m2
// println m3

// Q19

// def m1 = [1:'A',2:'B']
// println m1.class // won't work as class can be a map key
// println m1.getClass()

// Q20

// Map m = ['1':2,'2':3,'3':4,'2':5]

// Yes this is a valid construction , the m['2'] will be overwritten to
// 5 as it is defined later on in the map.

// Q21

// Map m = ['1':2,'2':3,'3':4,'2':5]
// println m.containsKey('1')

// Q22

// 22a => There are 3 departments (3 map keys)
// 22b => The computing dept delievers 2 programs .
// 22c => 200 students are enrolled in civil program

// Q23

// class Employee{
//     def name,age,deptName,empNo,salary
// }




// Q24

// def s = "https://www.google.com?name=johny&age=20&hobby=cricket"

// def getvalues = {
//     String x ->
//     def l1 = (((x.tokenize("?")[1]).tokenize("&").tokenize("=")))
//     l1.eachWithIndex{
//         x,index -> if()
//     }
// }

// println getvalues.call(s)
