package model;

import java.util.Objects;

public class Employee {
    private String id;
    private String code;
    private String name;
    private String nic;
    private String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee(String id, String code, String name, String nic, String address) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.nic = nic;
        this.address = address;
    }

    @Override
    public boolean equals(Object obj) {
        Employee emp= (Employee) obj;

        if(emp.getId()==this.getId() && emp.getCode()==this.getCode()){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", nic='" + nic + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
