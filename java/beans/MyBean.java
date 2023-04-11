import com.example.bdk.core.Bean;

public class MyBean implements Bean {
    private String name;
    private int age;
    
    public MyBean() {
    }
    
    public MyBean(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public void init() {
        // Perform initialization logic for the Bean
        // This method will be called during Bean initialization
    }
    
    @Override
    public void destroy() {
        // Perform cleanup logic for the Bean
        // This method will be called during Bean destruction
    }
    
    // Other business methods
    public void greet() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}