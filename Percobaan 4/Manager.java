/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Restu
 */
class Manager extends Employee {
//tambahan attribrute untuk kelas manager
    private String department;
    public Manager(String name,double salary,String dept){
        super(name,salary);
        department=dept;
    }

    public Manager(String n,String dept){
        super(n);
        department=dept;
    }
    
    public Manager(String dept){
        super();
        department=dept;
    }
    
    public String GetDept(){
        return department;
    }
}

