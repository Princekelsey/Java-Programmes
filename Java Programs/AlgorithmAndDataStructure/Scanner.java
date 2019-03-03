import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


class Person{

        private String gender;
        private String name;
        private int age;

        public Person(String gender, String name, int age){
            this.gender = gender;
            this.setName(name);
            this.age = age;
        }

        /**
         * @return the gender
         */
        public String getGender() {
            return gender;
        }

        /**
         * @param gender the gender to set
         */
        public void setGender(String gender) {
            this.gender = gender;
        }

        /**
         * @param name the name to set
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * @return the name
         */
        public String getName() {
            return name;
        }

        /**
         * @return the age
         */
        public int getAge() {
            return age;
        }

        /**
         * @param age the age to set
         */
        public void setAge(int age) {
            this.age = age;
        }

        public String toString(){
            return this.gender + " " + this.name + " " + this.age;
        }


    }
