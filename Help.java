/*Try this 3-1
a simple help system
*/
 class Help {
 	public static void public static void main(String[] args) 
 		throws java.io.IOException {
 		char choice;

 		system.out.println("Help on:");
 		system.out.println("	1. if");
 		system.out.println("	2. switch");
 		system.out.print("Choose one:");
 		choice = (char) system.in.read();

 		system.out.println("\n");

 		switch(choice) {
 			case '1':
 				system.out.println("The if:\n");
 				system.out.println("if (condition)  statement;");
 				system.out.println("else statement;");
 				break;
 			case '2'
 				system.out.println("The switch: \n")
 				system.out.println("switch (expression) {");
 				system.out.println("	case constant:");
 				system.out.println("		statement sequence");
 				system.out.println("		break;");
 				system.out.println("	// ...");
 				system.out.println("}");
 				break;
 			default:
 				system.out.print("Selection not found.")
 		}
 	}
}