
//above are being import the super classes that it will be used in the code.
public class Main {

//	this is the constructor that will call the objects (methods)	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Graphical printer = new Graphical();
//		Main Screen is being printed using the setMenssage() and the effect of type writer, and the timer delay, is setting by typeWriter()
		printer.setMessage("##############################################################################################################################################################################\r\n" + 
				"##############################################################################################################################################################################\r\n" + 
				"################################################################################################################################,,,,,,,,,,####################################\r\n" + 
				"#########################################################################################################################,,,,,,,,,,,,,,,,,,,,,,,,#############################\r\n" + 
				"#####################################################################################################################,,,,,,                    ,,,,,,#########################\r\n" + 
				"################       ############       ##                  .#                        ##########################,,,,,                            ,,,,,######################\r\n" + 
				"#################      ###########       ###                  .#                        ########################,,,,                                  ,,,,####################\r\n" + 
				"##################      #########       ####      #######################      ###############################,,,,             .,,       .,,            ,,,,##################\r\n" + 
				"###################      #######       #####      #######################      ##############################,,,            ,,,   ,,,,,,,   ,,,           ,,,#################\r\n" + 
				"###################       ######      ######      ************###########      #############################,,,            ,,       .,,       ,,           ,,,################\r\n" + 
				"####################       ####      #######                  ###########      ############################,,,       .,,,,,,,        ,        ,,,,,,,       ,,,###############\r\n" + 
				"#####################      ###      ########      #######################      ############################,,,      ,,       ,,     ,,,     .,      ,,,     ,,,###############\r\n" + 
				"######################      #      #########      #######################      ############################,,,      ,,        ,,,,,,,,,,,,,,         ,,     .,,,##############\r\n" + 
				"#######################     ,     ##########      #######################      ############################,,,      ,,,       ,,          .,.       ,,.      ,,,##############\r\n" + 
				"########################         ###########                   ##########      ############################,,,        ,,,,,,,,              ,,,,,,,,,       ,,,###############\r\n" + 
				"#########################,,,,,,,,###########,,,,,,,,,,,,,,,,,,,##########,,,,,,############################,,,.            .,,               ,,             ,,,###############\r\n" + 
				"############################################################################################################,,,             ,,              .,,            ,,,################\r\n" + 
				"##########################        ######     ###########     ###      ######    ###*   *#######        ######,,,.            ,,.   ,,,,,   ,,,            ,,,#################\r\n" + 
				"#######################     .*/,     ###     ###########     ###       #####    ###*   *####     .*/,     ####,,,,             ....     ...             ,,,,##################\r\n" + 
				"######################     ######     ##     ###########     ###        ####    ###*   *###     ######     #####,,,,                                  ,,,,####################\r\n" + 
				"#####################     ##############     ###########     ###    #     ##    ###*   *##     ####################,,,,                            ,,,,,######################\r\n" + 
				"#####################     ##############     ###########     ###    ##     #    ###*   *##     ######################,,,,,,                    ,,,,,,#########################\r\n" + 
				"######################     ######     ##     ###########     ###    ####        ###*   *###     ######     ##############,,,,,,,,,,,,,,,,,,,,,,,,,,###########################\r\n" + 
				"#######################              ###              ##     ###    #####       ###*   *####             ##########################,,,,#######################################\r\n" + 
				"########################### ,.,  ############################################################### ,.,  ########################################################################\r\n" + 
				"##############################################################################################################################################################################\r\n" + 
				"##############################################################################################################################################################################\r\n" + 
				"######################################################################################################    DEVELOPED BY:    CAROLINA SACCO   &   GIBRAN RUBINGER  -  2020 V.1.0\r\n" + 
				"");	
		printer.typeWriter(null, 1);
		
//		Standard effect for any interaction with the client.  
		printer.setMessage("\n\n\n\nBOM DIA CAROLINA \nGOSTARIA DE ALGO?");
		printer.typeWriter(null, 50);
		
//		error message
		printer.setMessage("\r\n" + 
				"                                                                                                                                                                              \r\n" + 
				"                                                                                                                                                  @(    @*                    \r\n" + 
				"                                                                                                                                              @&            @&                \r\n" + 
				"                                                                                                                                            @@               @@&              \r\n" + 
				"                                                                                                                                           @@@                @@@             \r\n" + 
				"                                                                                                                                          &@@@  @@@@@@@@@@@. /@@@             \r\n" + 
				"    @@@@@@@@@.   @@.@@@,@@@     @@@@,,@@@%     %@@@@@./@@@      @@ @@@#@@@               @@         %@@  .@@%        @@                   %@@@@             @@@@@             \r\n" + 
				"    @@           @@.     (@@    @@      @@    @@         @@&    @@      @@              @@         #@#     &@%      @@                 @@@@@@@@@@@,      %@@@@@@@@@@@         \r\n" + 
				"    @@@@@@@@&    @@*,,,%@@*     @@,,,/@@@    @@#          @@    @@,.,*@@@              @@   @@     @@       @@     @@   @@          .@@@%     .@@@@@   &@@@@#     ,@@@@       \r\n" + 
				"    @@           @@.  %@@/      @@   @@@     &@@          @@    @@   @@@              @@    @@     @@       @@    @@    @@         /@*     @@@    @#    @.   /@@      @@      \r\n" + 
				"    @@           @@.    (@@     @@     @@*    @@#        @@*    @@     @@&           @@@@@@@@@@@   *@@     @@(   @@@@@@@@@@@       @        @@@    /@@@@     @@@       &/     \r\n" + 
				"    @@@@@@@@@&   @@.     .@@    @@      @@&     @@@@&@@@@#      @@      &@@                 @@       @@@&@@@            @@         @         @@@@   @@@@  *@@@.         ,     \r\n" + 
				"                                                                                                                                               .@  #@@@@  @&           &      \r\n" + 
				"                                                                                                                                                  @@@@@@@,                    \r\n" + 
				"                                                                                                                                       (@     ,@@@@@@(@@@@@@@     *@          \r\n" + 
				"                                                                                                                                           .,                .,               \r\n" + 
				"\r\n" + 
				"");
		printer.typeWriter(null, 1);
		
		
		RandomName printName = new RandomName();
		//printName.setRandomSelect(printName.randomSelect);
		//printName.getRandomSelect();
		
		System.out.println(printName);
		System.out.println(printName);
		System.out.println(printName);
		System.out.println(printName);
		System.out.println(printName);
		
		
		
	}

}
