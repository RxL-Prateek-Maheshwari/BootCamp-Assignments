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

