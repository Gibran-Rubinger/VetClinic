package greetings;

import graphical.Graphical;

public class SendOurGreetings {

	Graphical printer = new Graphical();

	public void bye() {

		printer.typeWriter("\n\n\n\n\n                      That's the end Folks! \n\n\n\n\n", 45);
		printer.typeWriter(
				",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,&&&&&#,,,,,&&&&&&&&,&&*,,,,,&&%&&&&&&&&,*&&,,,,,,,,,/@@@&,,,,/&&&&&(,,,&&&&&&&&,%&&&&&/,,,,,,,&&&&&%*,,&&&,,,,%&&,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@*,,,@@@,,@@&,,,,,,/@@,,,,@@@,@@@,,,,,,*@@,,,,,,,@@&,,,,@@@,/@@,,,%@@,@@%,,,,,,&@@,,,*@@@,,,,@@#,,,@@*,&@@,,@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@*,,,,@@@,@@@@@@@@,,#@@,,&@@,,@@@@@@@@,*@@,,,,,,@@@,,,,,,@@,/@@@@@@@@,@@@@@@@@,&@@,,,,,@@*,,,@@@@@@@,,,,,@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@*,,,,@@%,@@&,,,,,,,,&@&/@@,,,@@@,,,,,,*@@,,,,,,/@@,,,,,&@@,/@@,,,,,,,@@%,,,,,,&@@,,,,@@@,,,,@@#,,,@@@,,,,@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@%,,,@@@@@@@@,,,,@@@@,,,,@@@@@@@@/*@@@@@@@@,,&@@@@@@/,,/@@,,,,,,,@@@@@@@@,&@@@@@@@,,,,,,@@@@@@@&,,,,,@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,@@@@@,,,,,,,,@@@,,,,,#@@@@@/,,,,,,,#@@@@@%,,,,,,,,,,,,@@@,,,,,,,,,&@@*,,,,/@@#,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,@@@@/,*@@@,,,,,,@@@,,,,,#@@/,&@@%,,,,,#@@(,/@@@,,,,,,,,,@@@@@,,,,,,,,@@@@@,,,(@@%,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,@@@*,,,,,,,,,,,,,@@@,,,,,#@@&&@@@,,,,,,#@@(,,@@@,,,,,,,,@@@,@@@,,,,,,,@@@%@@%,(@@%,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,@@@,,,&@@@@@#,,,,@@@,,,,,#@@&%&@@@*,,,,#@@@@@@,,,,,,,,,@@@,,,@@@,,,,,,@@@,,@@@/@@%,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,@@@@,,,&@@@,,,,,@@@,,,,,#@@/,,&@@@,,,,#@@(,@@@@,,,,,,@@@@@@@@@@@,,,,,@@@,,,*@@@@%,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,#@@@@@(,,,,,,,@@@,,,,,#@@@@@@&,,,,,,#@@(,,,@@@@,,,@@@,,,,,,,@@@,,,,@@@,,,,,@@@%,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,/@@@@@@@,,,,,,,@@@,,,,#@@(,,,,*@@@@@@&,,,,,,,@@@,,,,,@@@(,,,,@@@,,,,,,,,@@@@@@@,,,,,,,@@@@@@@@,,,,,@@@@@@@/,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,/@@%,,@@@%,,,,,@@@,,,,(@@(,,,,*@@&,,@@@,,,,,,@@@,,,,,@@@@@,,,@@@,,,,,*@@@(,,,,@,,,,,,,@@@,,,,,,,,,,@@@,,#@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,/@@&(@@@@,,,,,,@@@,,,,(@@(,,,,*@@@@@@&,,,,,,,@@@,,,,,@@@#@@@,@@@,,,,,@@@,,,######/,,,,@@@@@@@%,,,,,@@@(&@@@*,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,/@@%@@@*,,,,,,,@@@,,,,#@@(,,,,*@@&,,#@@@,,,,,@@@,,,,,@@@,,@@@@@@,,,,,@@@#,,,,,&@@(,,,,@@@,,,,,,,,,,@@@@@@%,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,/@@%,,@@@(,,,,,*@@@@@@@@@,,,,,*@@@/%@@@@,,,,,@@@,,,,,@@@,,,,@@@@,,,,,,&@@@@&@@@@%,,,,,@@@@@@@&,,,,,@@@,,@@@&,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,*%&%,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,%&#,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,///,,,,,,,,,(//,,,,,,///,,,,,,,,,///,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@,,,,,,,,@@@@@,,,*@@&,,,,,,,,@@@@#,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@,@@@,,,,,,,@@@@@@(,*@@&,,,,,,,@@@#@@#,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@*,,@@@,,,,,,@@@,,@@@*@@&,,,,,,@@@,,%@@%,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@,,,,,@@@,,,#@@@@&,,,,,@@@@@@@@@@%,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@/,,,,,,@@@,,,,@@@,,,,,@@@&,,,,@@@,,,,,,&@@%,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@#,,,,,,,,(@@@@@@&,,,,,,,,,,,@@@,,,,,,,,,@@@,,,,@@@,,,,,,,,@@@,,,,,,,,&@@@@@%,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@%,,,,,,,(@@(,,@@@(,,,,,,,,@@@@@,,,,,,,,@@@,,,,@@@,,,,,,,,@@@,,,,,,@@@&,,,@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@,(@@%,,,,,,(@@(,/@@@,,,,,,,,@@@,@@@,,,,,,,@@@,,,,@@@,,,,,,,,@@@,,,,,@@@,,,,,,,@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@%,,,,,(@@&@@@,,,,,,,,,@@@@@@@@@,,,,,,@@@,,,,@@@,,,,,,,,@@@,,,,,@@@,,,,,,*@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@#((((&@@&,,,,(@@(,(@@@,,,,,,@@@(((((@@@,,,,,&@@@@&@@@@,,,,,@#@@@@,,,,,,@@@@@#@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,&@@/,,,,,,&&@%,,,(@@(,,,%@@@,,,@@@,,,,,,,@@@,,,,,,*@@@@#,,,,,,,%@@@,,,,,,,,,,,&@@@%,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,*%@@@@@@@@@@(*/%&@@@@@@@%,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,#@,@@@@@@#//(@@@@%,,&@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,@@@@&@@,,,,,,,,,,,,,,,,,,,,,,,,,,,*#@&,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,@@@@@#,*&,,&#@&,,,,**,,,,,,,,,@@@@@@@@@@@@@@@@#,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,*@@,,,,,&,,,,,*@@@@@@@@@@@@@@@@@@#,,,&@@&,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,*@@@@@@@@@@(,/@@@@@@@@*@@@@@#,/@@@%%@@(.@@@@@,,,,,,@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,@@@@@@@@@%,,,,,,,@(/@@,#@@&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,@@,,,,,,,,,,,,,,,,,,\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/,,@@@@@@@@,,,,@@@@@@#,,,,,,@@@@@&,,,,,,,,,,,,@@@@@/@@@@@&,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&,,,,,,,@@@&,*,,,,,,,,,@@%,,,,,,,,,,*,,,,,,,,,,,,@@@@@@@,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@,,,,,,,@@@,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,&&@@@@@@@@@@@@@@@@@@@@@@@@@,*@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,@@&@@@*,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%,@@*,@#,,,,,,,,,,,,,,,,,,,,,,,,,,&@(@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%/,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.@@@@@@@@@@@@@@@@@@/@@@,@@@@@@,,/@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@#,,*@@&,,&@@@@,,,,,,,@@@@%,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@,,,,,,,,,@,,@@,&@@@@@@@@@@@@@,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@(*@@@@@@@@,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@,,,,@@@@@/,(,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@@@#,,,,(*,,,,,,*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&@,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,@,@@@@@@@@@%,,,,,,,@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,@,@@@@@@#,,,,,,,,,,&@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,&@@@@@@@@(,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,/@@@@#,,,,,,,,#@@@*,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,&@@@@@@@@@@@@,,,,,@@@@@@@@@@@@@#&@@@@@@@@@@@@@/,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,@@@@@/,(@@,,,,,,/@@@@@@&#,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,@@@@@@@@@,,,,,,,,,/@@@@@@@,,,,,*@@@@@@@&,@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,@@@@@(,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,%@@@@,,,,,,,,,,,,,,,@@@@,,,,,,,,,,/@@@@@@%,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,@@,,,,,,@@@@,,,*,,,,,,,,,,,,,,,,,,,,,,,,,,,,*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@##@@@,,,,,,,,,,,,,,,@@@,,,,,,,,,,,@,,@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,((,@,,,,,,,,,,&@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,&@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,@@*,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,.,,,,,,,,,@@,@@,,,,,,@@,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@*,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,/@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,%@@%,,,@@@@@,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@&%,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,*@@@@@@@@@@@@@@@@@@@&,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@&,(@@@@,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@/,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@%,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@%,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,&@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@*,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@(,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,#@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,*,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@@#,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,*@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,%@@@@@,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,#@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,(@@@@@,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,#@@@@@@@@@@&,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@*,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@&*,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,%@@@@@@@@@#,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@&,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,%@@@@&,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,&@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@&,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\r\n"
						+ "\r\n" + "",
				1);

		printer.typeWriter(
				"\n\n\n\n\n\n                                       We  thank  you  for  using  the  VetClinic  a  program  developed  by  Ana  Araujo and  Gibran Rubinger, \r\n"
						+ "                                        a  very  crazy c ouple  who  had  a strange  idea  to  do  Higher  Diploma  in Science in Computing together.\r\n"
						+ "\r\n" + "                                         A Letter Of Hope\r\n" + "\r\n"
						+ "                                        	Developing this work at a distance was  challenging and had to  adapt to a  new daily  routine, studies, \r\n"
						+ "                                        classes  and  behaviour. We are  grateful  for all the  content made  available  by the  Professors  and for \r\n"
						+ "                                        the  explanatory  videos made available on  Moodle to fulfil the lack of physical presence in the classrooms.\r\n"
						+ "                                        We  finish this  CA with the feeling  of understanding  the pillars  for the development  of object-oriented \r\n"
						+ "                                        programming in Java aware that Java universe is wide  and  although  our  steps  were  small  we  know  that \r\n"
						+ "                                        those  were good  enough to  move us forward to lead us to learn from them.\r\n"
						+ "\r\n"
						+ "                                        	The targets of our project were:\r\n"
						+ "                                        	• Provide better organisation of the code;\r\n"
						+ "                                        	• Create passive structures for reuse;\r\n"
						+ "                                        	• Demonstrate that we understand the “Abstraction” paradigm in your mental creation (mental model);\r\n"
						+ "                                        	• Demonstrate  that we have  learned to  use class  resources,  attributes, methods, encapsulation \r\n,"
						+ "                                                association,  inheritance and polymorphism.\r\n "
						+ "                                        	• Be user friendly\r\n" + "\r\n"
						+ "\r\n"
						+ "                                        It was interesting to note that in the  course of the program developed the first algorithm implemented it \r\n"
						+ "                                        was almost always not adopted and that there are numerous methods to solve the same problem. \r\n"
						+ "                                        This CA was developed by  Gibran  and  Ana  side  by  side  in which  it was challenged and also exhaustive in \r\n"
						+ "                                        measures that think different approaches of respecting the same subject.\r\n"
						+ "                                        It was implemented additional  as you  can see.  We really  wanted  to  implement  the Queue (by ourselves) on \r\n"
						+ "                                        time but anyway we got so close to solve it but the instantiation of  the  staff  list  inside a method in the \r\n"
						+ "                                        super class staff was getting empty. unfortunately was not possible to  print  it but anyway we are very happy \r\n"
						+ "                                        with our development  thanks to the requirements that have been asked on this CA.\r\n"
						+ "                                        There  were  many  hours  of  discussions,  doubts,  blockades  (especially search), googling. We realise that \r\n"
						+ "                                        working  together is like  to  insert  a gear  in an  already  running  machine  something  very  complex  and\r\n"
						+ "                                        difficult  to perform  in which  we realised  how  important  is teamwork is in the face of complex structures \r\n"
						+ "                                        they have to deal with.\r\n" + ""
						+ "                                        Thank you again Amilcar and Ken we learn a lot and really enjoy to do it.\r\n\n\n "
						+ "                                        Best regards,\r\n" + ""
						+ "                                        Gibran Rubinger\r\n"
						+ "                                        Ana Araujo\n\n\n\n",
				15);
	}
}
