package org.task.lectureFour;

public class People implements Comparable {
    private String family;
    private String phone;

    public People(String family, String phone) {
        this.family = family;
        this.phone = phone;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public People(String family) {
        this.family = family;
    }

    @Override
    public boolean equals(Object people){
        return (this.getFamily().equalsIgnoreCase(((People)people).getFamily()));
    }

    @Override
    public int compareTo(Object o){
        return (int)this.getFamily().charAt(0) - (int)((People)o).getFamily().charAt(0);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

