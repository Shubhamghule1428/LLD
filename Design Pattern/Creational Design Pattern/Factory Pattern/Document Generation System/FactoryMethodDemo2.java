// Client Code - Document Generation System Demo
public class FactoryMethodDemo2 {
    public static void main(String[] args) {
        System.out.println("=== Document Generation System ===\n");
        
        // PDF document
        Application pdfApp = new PDFApplication();
        pdfApp.newDocument(
            "Project Report",
            "John Doe",
            new String[]{
                "Introduction: This report covers the Q4 analysis.",
                "Chapter 1: Market Overview",
                "Chapter 2: Financial Performance",
                "Conclusion: Positive growth trajectory observed."
            }
        );
        
        // Word document
        Application wordApp = new WordApplication();
        wordApp.newDocument(
            "Meeting Notes",
            "Jane Smith",
            new String[]{
                "Date: 2024-01-15",
                "Attendees: John, Jane, Bob",
                "Agenda: Q1 Planning",
                "Action Items: Review budget, assign tasks"
            }
        );
        
        // Excel document
        Application excelApp = new ExcelApplication();
        excelApp.newDocument(
            "Sales Data",
            "Bob Johnson",
            new String[]{
                "Month,Product,Sales,Revenue",
                "Jan,Product A,100,5000",
                "Feb,Product A,150,7500",
                "Mar,Product A,200,10000"
            }
        );
        
        // Demonstrating flexibility
        System.out.println("\n=== Testing Application Flexibility ===");
        Application[] applications = {pdfApp, wordApp, excelApp};
        
        for (Application app : applications) {
            System.out.println("Using: " + app.applicationName);
        }
    }
}

// output
/**
 === Document Generation System ===


==================================================
Application: Adobe PDF Creator
PDF Document created: Project Report
Opening PDF document: Project Report
PDF Reader initialized
Content added to PDF (Page 1)
Content added to PDF (Page 1)
Content added to PDF (Page 1)
Content added to PDF (Page 1)

=== PDF Document Metadata ===
Type: PDF
Title: Project Report
Author: John Doe
Pages: 1
Content Length: 159 characters
Saving PDF document...
Compressing content...
Embedding fonts...
PDF saved as: Project_Report.pdf
File size: 0 KB
PDF document closed: Project Report
==================================================

==================================================
Application: Microsoft Word
Word Document created: Meeting Notes
Opening Word document: Meeting Notes
Microsoft Word initialized
Content added to Word document
Content added to Word document
Content added to Word document
Content added to Word document

=== Word Document Metadata ===
Type: Microsoft Word
Title: Meeting Notes
Author: Jane Smith
Comments: 0
Word Count: 15
Saving Word document...
Applying formatting...
Creating .docx structure...
Word document saved as: Meeting_Notes.docx
Word document closed: Meeting Notes
==================================================

==================================================
Application: Microsoft Excel
Excel Document created: Sales Data
Opening Excel document: Sales Data
Excel engine initialized
Row added to Excel (Row 1)
Row added to Excel (Row 2)
Row added to Excel (Row 3)
Row added to Excel (Row 4)

=== Excel Document Metadata ===
Type: Microsoft Excel
Title: Sales Data
Author: Bob Johnson
Sheets: 1
Rows: 4
Saving Excel document...
Calculating formulas...
Compressing spreadsheet...
Excel saved as: Sales_Data.xlsx
Excel document closed: Sales Data
==================================================

=== Testing Application Flexibility ===
Using: Adobe PDF Creator
Using: Microsoft Word
Using: Microsoft Excel
*/