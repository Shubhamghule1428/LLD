public class EnumSingletonDemo {
    public static void main(String[] args) {
        // Access singleton
        ApplicationContext context = ApplicationContext.INSTANCE;
        
        context.displayContext();
        
        // Get beans
        DataSource dataSource = context.getBean("dataSource", DataSource.class);
        UserService userService = context.getBean("userService", UserService.class);
        
        if (dataSource != null) {
            dataSource.connect();
        }
        
        if (userService != null) {
            userService.createUser("john_doe");
        }
        
        // Register new bean
        context.registerBean("emailService", new EmailService());
        
        // Get properties
        String env = context.getProperty("app.env");
        System.out.println("\nEnvironment: " + env);
        
        context.displayContext();
        
        // Verify singleton
        ApplicationContext context2 = ApplicationContext.INSTANCE;
        System.out.println("\ncontext == context2: " + (context == context2));
    }
}

class EmailService {
    public void sendEmail(String to, String message) {
        System.out.println("Email sent to " + to + ": " + message);
    }
}

// output
// ApplicationContext initialized
// Bean registered: dataSource
// Bean registered: userService

// === Application Context ===
// Registered Beans: [dataSource, userService]        
// Properties: {server.port=8080, app.env=development}
// DataSource connected
// User created: john_doe
// Bean registered: emailService

// Environment: development

// === Application Context ===
// Registered Beans: [dataSource, emailService, userService]
// Properties: {server.port=8080, app.env=development}

// context == context2: true

// It's demonstrated that the ApplicationContext is initialized only once, and the same instance is shared across the application. The enum-based singleton is thread-safe and provides a simple way to implement a singleton without worrying about synchronization issues.