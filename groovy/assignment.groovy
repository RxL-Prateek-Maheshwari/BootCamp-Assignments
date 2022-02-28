// Question 1 , 2 and 4

import java.io.File

// Employee emp = new Employee(name:"Prateek",age:20,gender:'Male',address:"Noida",
// empId:120,company:"RxLogix",salary:null);
// class Person{
//   def name,age,gender,address;
// }

// class Employee extends Person{
//   def empId,company,salary;

//     @Override
//     public String toString(){
//         return """${this.name} is a ${this.gender} aged ${this.age} who lives in ${this.address}. He works
//         for ${this.company} with employee id ${this.empId} and draws ${this.salary} lots of money. """
//     }

// }

// println "${emp.name} is aged ${emp.getAge()}"
// print "${emp}";


// // Question 3

// for (i in 0..3) {
//     for(j in 1..(2**i)){
//         print("*");
//     }
//     print("\n");
// }

// // Question 5 -> Incomplete

// // Question 6

// // Question 7


// //  method 1
// print "${(1..10).collect{it.multiply(3)}}"

// // method 2:
// def multiple = { param ->  for(i in (1..(param))){
//     print "${3*i} ";
// }}

// multiple.call(10)

// method 3 :
// (1..10).each{print "${it*3} "};

// Question 8

// def l1 = [10,20,30,40]
// def ele = 20
// print l1.any{element -> element = ele}

// Question 9

// def file1 = new File("/home/rxlogix/Desktop/BootCamp-Assignments/groovy/test1.txt")
// def file2 = new File("/home/rxlogix/Desktop/BootCamp-Assignments/groovy/test2.txt")
// def file3 = new File("/home/rxlogix/Desktop/BootCamp-Assignments/groovy/test3.txt")

// file3 << file1.text
// file3 << file2.text

// Question 10

// int i=1;
// def output_file = new File("/home/rxlogix/Desktop/BootCamp-Assignments/groovy/test2.txt")
// new File ("/home/rxlogix/Desktop/BootCamp-Assignments/groovy/test1.txt").eachLine{
//     line -> if(i%2!=0) {
//         output_file.append("${i}- ${line} \n")
//         // new File("/home/rxlogix/Desktop/BootCamp-Assignments/groovy/test2.txt").withWriter('utf-8'){
//         // writer -> writer.writeLine "${i}- ${line}"
//         // }
    
//     println "$line"; 
//     }
//     i++ ; 
//     }
        
// Question 11

// def output_file = new File("/home/rxlogix/Desktop/BootCamp-Assignments/groovy/test2.txt")
// File input_file = new File ("/home/rxlogix/Desktop/BootCamp-Assignments/groovy/test1.txt")
// text = input_file.getText('UTF-8')

// text = text.tokenize(" ")
// text = text.join("")
// text = text.tokenize("\n")
// output_file.write(text.join(""))

// Question 12




