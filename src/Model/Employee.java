/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author 91983
 */
public class Employee {
    
    private String name;
    private int employee_id;
    private int age;
    private String gender;
    private String date;
    private int level;
    private String team_info;
    private String position_title;
    private String cell_no;
    private String email;
    private ImageIcon photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getTeam_info() {
        return team_info;
    }

    public void setTeam_info(String team_info) {
        this.team_info = team_info;
    }

    public String getPosition_title() {
        return position_title;
    }

    public void setPosition_title(String position_title) {
        this.position_title = position_title;
    }

    public String getCell_no() {
        return cell_no;
    }

    public void setCell_no(String cell_no) {
        this.cell_no = cell_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ImageIcon getPhoto(int width, int height, int SCALE_SMOOTH) {
        return photo;
    }

    public void setPhoto(Icon photo) {
        this.photo = (ImageIcon) photo;
    }
    
   
    
    @Override
    public String toString(){
        return name;
    }
    
    
    
            
    
}
