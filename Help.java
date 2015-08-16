 class Help {
 	public static void public static void main(String[] args) 
 		throws java.io.IOException {
 		char choice;

 		do {
 		system.out.println("Help on:");
 		system.out.println("	1. if");
 		system.out.println("	2. switch");
 		system.out.println("	3. for");
 		system.out.println("	4. while");
 		system.out.println("	5. do-while\n");
 		system.out.print("Choose one:");
 		
 		choice = (char) system.in.read();

 		do {
 			ignore = (char) system.in.read();
 		} while (ignore != '\n');
 	}while (choice < '1' | choice > '5')
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
 			case '3'
 				system.out.println("The for:\n");
 				system.out.print("for(init; condition; iteration)");
 				system.out.println(" statement;");
 				break;
 			case '4'
 				system.out.println("The while: \n");
 				system.out.println("while (condition statement;");
 				break;
 			case '5'
 			system.out.println("The do-while:\n");
 			system.out.println("do {");
 			system.out.println(" statement");
 			system.out.println("} while (condition);");
 			break;
 			}
 		}
 	}
