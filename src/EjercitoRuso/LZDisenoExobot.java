package EjercitoRuso;
public class LZDisenoExobot {
    public static final String ROJO = "\033[38;5;196m";
    public static final String ROJOD = "\033[38;5;160m";
    public static final String AZUL = "\033[38;5;20m";
    public static final String AZULD = "\033[38;5;21m";
    public static final String BLANCO = "\033[38;5;15m";
    public static final String GRIS = "\033[38;5;255m";
    public static final String ROSA = "\033[38;5;205m";
    public static final String VIOLETA = "\033[38;5;177m";
    public static final String TURQUESA = "\033[38;5;43m";
    public static final String GREENC = "\033[38;5;76m";
    public static final String RESET = "\u001B[0m";


    public void lzVerExabot(){
        System.out.println(TURQUESA);
        System.out.println(ROJOD+"               .-==-:.                                                            .--   ");
        System.out.println("              :+-++++++=:."+GRIS+"         .                                       "+ROJOD+".::=+*+-.    ");
        System.out.println("                :=+++++++*=.     "+GRIS+".-                                   "+ROJOD+".:-+*###=:        ");
        System.out.println("       .-:.       .-++++++++++-"+GRIS+":"+GREENC+"=="+GRIS+":      "+ROJOD+".--===--:..            .:--+**#%#+-.           ");
        System.out.println("        *####*+=:    :=+++++++"+BLANCO+"+"+ROJOD+"="+BLANCO+"++"+ROJOD+"=-..:=+=---=******++----::-=+=--+#%#+-.               ");
        System.out.println(BLANCO+"        ."+ROJO+"#####**++:    :==++"+GRIS+"+"+ROJOD+"+++*"+GRIS+"##"+ROJOD+"**"+BLANCO+"***"+ROJO+"*++*******++==+**####=-+"+BLANCO+"--+=.                   ");
        System.out.println("         -"+ROJO+"%####*####+-.  "+GRIS+".-+####=+"+ROJOD+"###%"+BLANCO+"*="+ROJO+"=#*"+BLANCO+"*"+ROJO+"****+++*#######+"+BLANCO+"-+%=-.                      ");
        System.out.println("          ="+ROJO+"%############"+BLANCO+"+"+ROJO+"="+BLANCO+"-="+RESET+"=***"+BLANCO+"+*%"+ROJOD+"#@@*+"+BLANCO+"+**"+ROJO+"*##+***#######*"+BLANCO+"+=##--.                       ");
        System.out.println("           -#"+ROJO+"#########"+BLANCO+"*"+ROJO+"##"+BLANCO+"%%##"+RESET+"==*"+BLANCO+"%=-####"+BLANCO+"###"+ROJO+"#############*"+BLANCO+"+=+%*=-                         ");
        System.out.println("            :*##**"+ROJO+"####"+BLANCO+"*"+ROJO+"%#"+BLANCO+"%%%#**+*"+BLANCO+"+=*#%##*-=#########++*###*+=+"+ROJO+":                         ");
        System.out.println("              "+BLANCO+"..-+=*##%"+ROJO+"%"+BLANCO+"%%+*==+"+BLANCO+"**"+ROJO+"**"+BLANCO+"####*+=####%%####==+++*#*#"+ROJO+"%%#+:                      ");
        System.out.println(AZUL+"                :@%"+ROJO+"#####"+BLANCO+"%#==+#"+ROJO+"####"+BLANCO+"***+=++=*##%"+ROJO+"%%##%%%%@%+"+BLANCO+"+++"+ROJO+"+++***#+-                   ");
        System.out.println(AZUL+"                -@@@%"+ROJO+"##"+BLANCO+"+**"+BLANCO+"*#"+ROJO+"#%%%#"+BLANCO+"###"+ROJO+"=::=**#%%%%%@@@@"+AZUL+"%*##"+RESET+"     "+BLANCO+"+"+ROJO+"=*++++++===-.             ");
        System.out.println(BLANCO+"                #"+AZUL+"@@%"+ROJO+"###"+BLANCO+"*"+ROJO+"####%%#####+=+#%%%%%%@@@@@@"+AZUL+"%#+#%=  "+BLANCO+":-:"+ROJO+"-==+++++++++++=:          ");
        System.out.println(BLANCO+"               =#"+AZUL+"@@@%"+ROJO+"*#####%##"+AZUL+"%%%%%%@*"+ROJO+"-+%@@@%%%%@@+"+AZUL+"%#+### "+BLANCO+":::::-   "+ROJO+".:-=+++++++==-.      ");
        System.out.println(BLANCO+"              :##"+AZUL+"@%%@%"+ROJO+"%%@@%"+AZUL+"###%%%@@@#   "+ROJO+".+%@@##%+. "+AZUL+"+##%%%:"+BLANCO+"==-::=        "+ROJO+"..:--::::.      ");
        System.out.println(BLANCO+"              ++*"+AZUL+"@%@@"+ROJO+"@@. "+AZUL+"#%%##%%%%%@:."+ROJO+"    .=+=:     "+AZUL+"%%##@#"+BLANCO+"=+=-:=                        ");
        System.out.println(BLANCO+"              =+*"+AZUL+"%@@"+ROJO+"@@@@@: "+AZUL+"*%@%##**=-"+BLANCO+":: "+ROJO+"++          "+AZUL+"=%#%@#"+BLANCO+"=*=="+ROJO+":"+BLANCO+"+                        ");
        System.out.println(BLANCO+"              =*"+ROJO+"%"+AZUL+"%#"+ROJO+"%@@@@@@."+AZUL+"#%@##*#*+"+BLANCO+"*+"+ROJO+" +##-          %%@%*+"+BLANCO+"=="+ROJO+"=-"+BLANCO+"+                        ");
        System.out.println(BLANCO+"              :"+ROJO+"%"+AZUL+"%"+ROJO+"##@@@%%@"+BLANCO+"%#"+AZUL+"#*=***+"+BLANCO+"*@#"+ROJO+"##%#%*         =%%#**+"+BLANCO+"="+ROJO+"+#"+BLANCO+"*                         ");
        System.out.println(BLANCO+"              ."+ROJO+"@@###%%##%"+BLANCO+"%"+AZUL+"%=::-="+BLANCO+"=#@@"+ROJO+"*+*##%%.        ###*###*%#.                         ");
        System.out.println("              -%@###%+##"+BLANCO+"#@#"+GRIS+"=:="+BLANCO+"+#%@@@"+ROJO+"%#*+*%%.       .%##*##%%#.                          ");
        System.out.println("              +##*##+.@*#"+BLANCO+"@@#%%%#"+ROJO+"@@#:*##*###.        %##*#@*#-                           ");
        System.out.println("             *#***##"+RESET+"  "+ROJO+"%##%@@%##+=.  :%#*###-       .%%#*%##*                            ");
        System.out.println("            +%##**%#"+RESET+"  "+ROJO+"*%###:%#-      *+"+BLANCO+"*"+ROJO+"###+       =###*#%#+                            ");
        System.out.println("            %%####%"+BLANCO+"*"+RESET+"   "+ROJO+"%###%-.       :"+BLANCO+"=:="+ROJO+"###      =###*+*%#.                            ");
        System.out.println("            #@%*=+:"+BLANCO+"*::"+ROJO+"==###@@:       "+BLANCO+".++:-"+ROJO+"*#.    .@@%#**##+                             ");
        System.out.println("            +@%"+BLANCO+"*++ #-=="+ROJO+"=##@@@:       "+BLANCO+".%%+:-*"+ROJO+"*     "+BLANCO+"=%####"+ROJO+"#*                              ");
        System.out.println("             ++"+BLANCO+"+== ====+%#"+ROJO+"#%%:        "+BLANCO+"%%=-==*:   .=######.                              ");
        System.out.println("              ="+BLANCO+"**+-+====%%%#%"+ROJO+"@.       "+BLANCO+"#%+"+ROJO+"="+BLANCO+"==*#"+ROJO+"*."+BLANCO+":-*=*%#*.                               ");
        System.out.println("               "+BLANCO+".**#+=*==+%%%#%*      "+ROJO+":"+BLANCO+"##"+ROJO+"%=="+BLANCO+"=##"+ROJO+"**"+BLANCO+"=**=*#+                                 ");
        System.out.println(BLANCO+"                 -+. +%#+#%##%"+ROJO+"@-      #"+BLANCO+"#"+ROJO+"%@#+#"+BLANCO+"%"+ROJO+"##+"+BLANCO+":++*=.                                 ");
        System.out.println("                      #"+BLANCO+"##*%%"+ROJO+"#%#       +"+BLANCO+"#"+ROJO+"%@%%%%"+BLANCO+"%"+ROJO+"%="+BLANCO+"**:                                    ");
        System.out.println("                      -##"+BLANCO+"#"+ROJO+"@@%%.        "+BLANCO+"#"+ROJO+"%%@###"+BLANCO+"%"+ROJO+"@*"+BLANCO+":                                      ");
        System.out.println(ROJO+"                      +###@@#.          +%%%###+                                        ");
        System.out.println("                     .####%@:             #%###=                                        ");
        System.out.println("                    +@#####**=            -@%###.                                       ");
        System.out.println("                   #%%####*###           :#%%###*#:                                     ");
        System.out.println("                  +#%########%           *@%%###**#                                     ");
        System.out.println("                 -%#######%*+:           #@%%%*+**#:                                    ");
        System.out.println("                +%####%+-"+BLANCO+"#%*====-.       "+ROJO+"=#%%#*##**"+BLANCO+".                                    ");
        System.out.println(ROJO+"               +%###+*"+BLANCO+"--*+=+###+-.        "+ROJO+"*@@*###-"+BLANCO+"+                                     ");
        System.out.println(BLANCO+"              +"+ROJO+"###+::"+BLANCO+"--==    ::           "+ROJO+"%@@###-"+BLANCO+"-%                                     ");
        System.out.println(BLANCO+"             +#"+ROJO+"##="+BLANCO+".+++==:                ."+ROJO+"*#@##+"+BLANCO+".-+                                     ");
        System.out.println(BLANCO+"            +**"+ROJO+"+"+BLANCO+".-###==-                 -+:"+ROJO+"##*"+BLANCO+" :-=                                     ");
        System.out.println(BLANCO+"           .+-. :###+-.                  #+- "+ROJO+"="+BLANCO+" .:==                                     ");
        System.out.println(BLANCO+"                *+-:                    .##+   -**+                                     ");
        System.out.println(BLANCO+"                                         *#=   =##-                                     ");
        System.out.println(BLANCO+"                                          ==   =*:                                      ");
        System.out.println(BLANCO+"                                               .                                        ");
        System.out.println(RESET);

    }
}

