import java.util.ArrayList;
import java.util.Scanner;

public class Selection {

    public static void main(String[] args) {

        ArrayList<String> champions = new ArrayList<>();

        champions.add("aatrox");
        champions.add("ahri");
        champions.add("alistar");
        champions.add("amumu");
        champions.add("anivia");
        champions.add("annie");
        champions.add("blitzcrank");
        champions.add("brand");
        champions.add("braum");
        champions.add("caitlyn");
        champions.add("cassiopeia");
        champions.add("chogath");
        champions.add("corki");
        champions.add("darius");
        champions.add("diana");
        champions.add("dr mundo");
        champions.add("draven");
        champions.add("elise");
        champions.add("evelynn");
        champions.add("ezreal");
        champions.add("fiddlesticks");
        champions.add("garen");
        champions.add("gnar");
        champions.add("gragas");
        champions.add("hecarim");
        champions.add("heimerdinger");
        champions.add("janna");
        champions.add("jarvan");
        champions.add("jinx");
        champions.add("karma");
        champions.add("karthus");
        champions.add("kassadin");
        champions.add("katarina");
        champions.add("kennen");
        champions.add("khazix");
        champions.add("leblanc");
        champions.add("lee sin");
        champions.add("lissandra");
        champions.add("lucian");
        champions.add("lulu");
        champions.add("malphite");
        champions.add("maokai");
        champions.add("miss fortune");
        champions.add("mordekaiser");
        champions.add("morgana");
        champions.add("nami");
        champions.add("nasus");
        champions.add("nautilus");
        champions.add("nidalee");
        champions.add("nocturne");
        champions.add("nunu");
        champions.add("olaf");
        champions.add("orianna");
        champions.add("pantheon");
        champions.add("quinn");
        champions.add("renekton");
        champions.add("rengar");
        champions.add("rumble");
        champions.add("ryze");
        champions.add("sejuani");
        champions.add("shaco");
        champions.add("shen");
        champions.add("shyvana");
        champions.add("sion");
        champions.add("sivir");
        champions.add("skarner");
        champions.add("sona");
        champions.add("soraka");
        champions.add("talon");
        champions.add("taric");
        champions.add("teemo");
        champions.add("thresh");
        champions.add("tristana");
        champions.add("trundle");
        champions.add("tryndamere");
        champions.add("twisted fate");
        champions.add("twitch");
        champions.add("udyr");
        champions.add("urgot");
        champions.add("varus");
        champions.add("veigar");
        champions.add("velkoz");
        champions.add("vi");
        champions.add("vladimir");
        champions.add("volibear");
        champions.add("warwick");
        champions.add("wukong");
        champions.add("xerath");
        champions.add("zac");
        champions.add("ziggs");
        champions.add("zilean");
        champions.add("zyra");
        champions.add("taliyah");
        champions.add("aurelion sol");
        champions.add("jhin");
        champions.add("illaoi");
        champions.add("kindred");
        champions.add("tahm kench");
        champions.add("bard");
        champions.add("reksai");
        champions.add("kalista");
        champions.add("azir");

        ArrayList<String> halfban = new ArrayList<>();

        halfban.add("riven");
        halfban.add("lux");
        halfban.add("fizz");
        halfban.add("swain");
        halfban.add("jayce");
        halfban.add("irelia");
        halfban.add("jax");
        halfban.add("yasuo");
        halfban.add("viktor");
        halfban.add("zed");
        halfban.add("xin zhao");
        halfban.add("vayne");
        halfban.add("ashe");
        halfban.add("graves");
        halfban.add("ekko");
        halfban.add("galio");
        halfban.add("kayle");

        ArrayList<String> completeban = new ArrayList<>();

        completeban.add("akali");
        completeban.add("gangplank");
        completeban.add("rammus");
        completeban.add("leona");
        completeban.add("syndra");
        completeban.add("fiora");
        completeban.add("malzahar");
        completeban.add("popppy");
        completeban.add("singed");
        completeban.add("master yi");

        ArrayList<String> specialcase = new ArrayList<>();

        specialcase.add("Kogmaw");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st champion");

        String first = input.next();

        boolean half = false;

        if (champions.contains(first)) {

            System.out.println("Non-banned champion selected");

        } else if(halfban.contains(first)){

            half = true;

            System.out.println("Half-banned champion selected");

        } else if(completeban.contains(first)){

            System.out.println("Completely banned champion selected");

        } else {

            System.out.println("Invalid champion... ");

        }

        System.out.println("Enter 2nd champion.");

        String second = input.next();

        if (champions.contains(second)) {

            System.out.println("Non-banned champion selected");

        } else if(halfban.contains(second)){

            if(half){

                System.out.println("You already have a half banned champion, this team isn't allowed.");

            } else {

                System.out.println("Half-banned champion selected");

            }

        } else if(completeban.contains(second)){

            System.out.println("Completely banned champion selected");

        } else {

            System.out.println("Invalid champion... ");

        }
    }
}


