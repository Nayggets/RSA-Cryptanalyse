import javax.swing.*;
import java.math.*;
import java.sql.SQLOutput;
import java.util.*;

class Rsa_canevas {


    static final BigInteger ZERO = new BigInteger("0");
    static final BigInteger ONE = new BigInteger("1");
    static final BigInteger TWO = new BigInteger("2");
    static final BigInteger THREE = new BigInteger("3");

    public static BigInteger M2BI(String m){
        String message = "";
        int position = 0;

        while (position < m.length()){
            char caractere = m.charAt(position);
            switch (caractere) {
                case 'a':
                    message = message + "01";
                    position ++;
                    break;
                case 'b':
                    message = message + "02";
                    position ++;
                    break;
                case 'c':
                    message = message + "03";
                    position ++;
                    break;
                case 'd':
                    message = message + "04";
                    position ++;
                    break;
                case 'e':
                    message = message + "05";
                    position ++;
                    break;
                case 'f':
                    message = message + "06";
                    position ++;
                    break;
                case 'g':
                    message = message + "07";
                    position ++;
                    break;
                case 'h':
                    message = message + "08";
                    position ++;
                    break;
                case 'i':
                    message = message + "09";
                    position ++;
                    break;
                case 'j':
                    message = message + "10";
                    position ++;
                    break;
                case 'k':
                    message = message + "11";
                    position ++;
                    break;
                case 'l':
                    message = message + "12";
                    position ++;
                    break;
                case 'm':
                    message = message + "13";
                    position ++;
                    break;
                case 'n':
                    message = message + "14";
                    position ++;
                    break;
                case 'o':
                    message = message + "15";
                    position ++;
                    break;
                case 'p':
                    message = message + "16";
                    position ++;
                    break;
                case 'q':
                    message = message + "17";
                    position ++;
                    break;
                case 'r':
                    message = message + "18";
                    position ++;
                    break;
                case 's':
                    message = message + "19";
                    position ++;
                    break;
                case 't':
                    message = message + "20";
                    position ++;
                    break;
                case 'u':
                    message = message + "21";
                    position ++;
                    break;
                case 'v':
                    message = message + "22";
                    position ++;
                    break;
                case 'w':
                    message = message + "23";
                    position ++;
                    break;
                case 'x':
                    message = message + "24";
                    position ++;
                    break;
                case 'y':
                    message = message + "25";
                    position ++;
                    break;
                case 'z':
                    message = message + "26";
                    position ++;
                    break;
                case ' ':
                    message = message + "27";
                    position ++;
                    break;
                case '-':
                    message = message + "28";
                    position ++;
                    break;
                case '!':
                    message = message + "29";
                    position ++;
                    break;
                case ',':
                    message = message + "30";
                    position ++;
                    break;
                case '\'':
                    message = message + "31";
                    position ++;
                    break;
            }
        }
        BigInteger BI = new BigInteger(message);
        return BI;
    }


    public static String BI2M(BigInteger m){
        String message = "";
        String mm = m.toString();
        int position = 0;

        if (mm.length() % 2 != 0){
            mm = "0" + mm;
        }
        while (position < mm.length()){
            String caracteres = mm.substring(position,position+2) ;
            if (caracteres.equals("01")){
                message = message + "a";
                position = position + 2;
            }
            else if (caracteres.equals("02")){
                message = message + "b";
                position = position +2;
            }
            else if (caracteres.equals("03")){
                message = message + "c";
                position = position +2;
            }
            else if (caracteres.equals("04")){
                message = message + "d";
                position = position +2;
            }
            else if (caracteres.equals("05")){
                message = message + "e";
                position = position +2;
            }
            else if (caracteres.equals("06")){
                message = message + "f";
                position = position +2;
            }
            else if (caracteres.equals("07")){
                message = message + "g";
                position = position +2;
            }
            else if (caracteres.equals("08")){
                message = message + "h";
                position = position +2;
            }
            else if (caracteres.equals("09")){
                message = message + "i";
                position = position +2;
            }
            else if (caracteres.equals("10")){
                message = message + "j";
                position = position +2;
            }
            else if (caracteres.equals("11")){
                message = message + "k";
                position = position +2;
            }
            else if (caracteres.equals("12")){
                message = message + "l";
                position = position +2;
            }
            else if (caracteres.equals("13")){
                message = message + "m";
                position = position +2;
            }
            else if (caracteres.equals("14")){
                message = message + "n";
                position = position +2;
            }
            else if (caracteres.equals("15")){
                message = message + "o";
                position = position +2;
            }
            else if (caracteres.equals("16")){
                message = message + "p";
                position = position +2;
            }
            else if (caracteres.equals("17")){
                message = message + "q";
                position = position +2;
            }
            else if (caracteres.equals("18")){
                message = message + "r";
                position = position +2;
            }
            else if (caracteres.equals("19")){
                message = message + "s";
                position = position +2;
            }
            else if (caracteres.equals("20")){
                message = message + "t";
                position = position +2;
            }
            else if (caracteres.equals("21")){
                message = message + "u";
                position = position +2;
            }
            else if (caracteres.equals("22")){
                message = message + "v";
                position = position +2;
            }
            else if (caracteres.equals("23")){
                message = message + "w";
                position = position +2;
            }
            else if (caracteres.equals("24")){
                message = message + "x";
                position = position +2;
            }
            else if (caracteres.equals("25")){
                message = message + "y";
                position =position +2;
            }
            else if (caracteres.equals("26")){
                message = message + "z";
                position =position +2;
            }
            else if (caracteres.equals("27")){
                message = message + " ";
                position = position +2;
            }
            else if (caracteres.equals("28")){
                message = message + "-";
                position = position +2;
            }
            else if (caracteres.equals("29")){
                message = message + "!";
                position = position +2;
            }
            else if (caracteres.equals("30")){
                message = message + ",";
                position = position +2;
            }
            else if (caracteres.equals("31")){
                message = message + "\'";
                position = position +2;
            }
            else{
                position = position +2;
            }
        }
        return message;
    }













    /*
    fi = ni/di

    Cas n°1
    n0 = q0
    d0 = 1

    Cas n°2
    n1 = q0*q1+1
    d1 = q0 soit n0

    Cas général
    ni = qini−1 + ni−2
    di = qidi−1 + di−2
     */

    /*-----------------------------Attaque de wiener-----------------------------------------------*/
    public static boolean isGoodD(BigInteger d,BigInteger n, BigInteger e){//Valide si le D est bon a partir de la clé public
        BigInteger messageTest = M2BI("je suis un bon petit d");
        BigInteger c = RSA.chiffrementRsa(messageTest,e,n);
        BigInteger decryptedMessage = RSA.dechiffrementRsa(c,d,n);
        return decryptedMessage.equals(messageTest);

    }

    public static BigInteger Attaque(BigInteger e, BigInteger N) { // Decompose E,N en fraction continue calcule tout les di a l'aide de la fonction recurrente et trouve la clé parmis tout les di puis la return
        ArrayList<BigInteger> big =  FractionContinue(e,N);
        ArrayList<BigInteger> possibled = FonctionRecurrenteCacul(big);
        BigInteger BonD = null;
        for(BigInteger bi : possibled){
            if(isGoodD(bi,N,e)){
                BonD = bi;
                break;
            }

        }
        return BonD;
    }

    public static BigInteger[] calculatePandQWithD(BigInteger d,BigInteger e,BigInteger N)
    {
        BigInteger p;
        BigInteger q;
        BigInteger k = d.multiply(e).subtract(ONE);
        if (isEven(k)) {

            //k = (2^t)r
            BigInteger r = k;
            BigInteger t = ZERO;

            do {
                r = r.divide(TWO);
                t = t.add(ONE);
            } while (isEven(r));

            //on cherche a trouver x = y² mod n == 1
            Random random = new Random();
            boolean success = false;
            BigInteger y = null;

            for (int i = 1; i <= 100; i++) {

                BigInteger g = getRandomBigIntegerCorrect(N, random);

                y = g.modPow(r, N);

                if (y.equals(ONE) || y.equals(N.subtract(ONE))) {
                    continue;
                }

                for (BigInteger j = ONE; j.compareTo(t) <= 0; j = j.add(ONE)) {
                    BigInteger x = y.modPow(TWO, N);

                    if (x.equals(ONE)) {
                        success = true;
                        break;
                    }

                    if (x.equals(N.subtract(ONE))) {
                        continue;
                    }

                    y = x;
                }

                BigInteger x = y.modPow(TWO, N);
                if (x.equals(ONE)) {

                    success = true;
                    break;

                }

            }

            if (success) {
                p = y.subtract(ONE).gcd(N); // p = GCD(y-1,N)
                q = N.divide(p); // q = N/P car N = p * q mon commentaire sert a rien c logique.
                BigInteger[] pq = new BigInteger[2]; // on imbrique les deux pour le return
                pq[0] = p;
                pq[1] = q;
                return pq;
            }
        }
        return null; // si aucun x na etait == 1 ou si k a etait impair des le debut
    }


    private static boolean isEven(BigInteger bi) {
        return bi.mod(TWO).equals(ZERO);
    }

    private static BigInteger getRandomBigIntegerCorrect(BigInteger n, Random rnd) {
        BigInteger g;
        do {
            g = new BigInteger(n.bitLength(), rnd);
        } while (g.compareTo(n) >= 0);
        return g;
    }


    private static ArrayList<BigInteger> FractionContinue(BigInteger e,BigInteger N){ // met E/N en fraction continue
        BigInteger inter = N;
        ArrayList<BigInteger> toReturn = new ArrayList<>();
        while(!N.equals(BigInteger.ZERO)){ // on fait euclide et recupere les coefficients a chaque fois exemple 122 = (12 ; 5)
            toReturn.add(e.divide(N));
            inter = N;
            N = e.mod(N);
            e = inter;

        }

        return toReturn;
    }


    private static ArrayList<BigInteger> FonctionRecurrenteCacul(ArrayList<BigInteger> coef) // calcul tout les di et les return
    {
        ArrayList<BigInteger> Alldi = new ArrayList<>();
        ArrayList<BigInteger> Allni = new ArrayList<>();
        if(coef.isEmpty()){
            return null;
        }
        BigInteger n0 = coef.get(0);
        BigInteger d0 = new BigInteger("1");
        Alldi.add(d0);
        Allni.add(n0);

        if(coef.size() < 2){
            return Alldi;
        }
        BigInteger n1 = coef.get(0).multiply(coef.get(1));
        n1 = n1.add(ONE);
        BigInteger d1 = coef.get(1);
        Alldi.add(d1);
        Allni.add(n1);
        BigInteger ni;
        BigInteger di;
        for(int i = 2 ; i < coef.size() ; i++){
            ni = coef.get(i);
            ni = ni.multiply(Allni.get(i-1));
            ni = ni.add(Allni.get(i-2));
            Allni.add(ni);
            di = coef.get(i);
            di = di.multiply(Alldi.get(i-1));
            di = di.add(Alldi.get(i-2));
            Alldi.add(di);
        }



        return Alldi;
    }

    /*-----------------------------------------Méthode decomposition de facteur Premier --------------------------------------*/
    public static BigInteger[] findPAndQ(PublicKey pk) //trouver P & Q de maniere conventionnel Plusieur millions d'année pour les clé actuels
    {
        BigInteger p = factor(pk.getN());
        BigInteger q = pk.getN().divide(p);
        BigInteger[] tab = new BigInteger[2];
        tab[0] = p;
        tab[1] = q;
        return tab;
    }
    public static BigInteger factor(BigInteger a){
        for(BigInteger i = BigInteger.valueOf(3) ; i.compareTo(a) < 0 ; i = i.add(BigInteger.ONE)){
            if(a.mod(i).equals(BigInteger.ZERO)){
                return i;
            }
        }
        return BigInteger.ZERO;
    }





    public static void main (String[] args) {
        RSA rsa = new RSA(128);

        // -----------------------Challenge 1 ---------------------------//
        BigInteger N1 = new BigInteger("12058731933941070984622965299485903458445050735353306862664456985956643479403684085275718715194874030013847986404142926904718446531402267778125586923183882380290798522645494142038280145044111145185076578476230207642968700675654498042155532278543246362701760009778307274396402934059579792493616964653921411762661994154108514892836687823619832564104796702248397269063512107525635449903077941712855520035276146163703730143536621628491218318706686011250649369929613466170278546153693458866806629595341346857443791721958447864260079987079914334071133732191040339795404730814646266355624848696800021237953879161436107466473");
        BigInteger E1 = new BigInteger("4042216654859850970930574553358219070642410380108623708105721191880434413355612238789898923130228685351170242639433199544508323386385734737180833003701796469857254235219950175150573106349644247950557068712974418256345372315857787691245009827935162804187624290662117619007028037809220484057526851952081833808434278089314144535962699701057182157148786226713091827732934496556774906292184422295204657173967900834248471740854305855283780860707954815407229999620084662357321094688662910339925769068207019834565146090635535435910595298926411548473686043239212259124342626519275813088957371539096672563499651051915169860681");
        BigInteger C1 = new BigInteger("9530824218528801884447077783830614279395935565956599362592005044214978864860296172370784973912686757613743186901614112721006767240481106256132180232634724523357428023534346246996992359922968519951245521561487259313848561572511216057551519614335002351493809038535587015852306511021591895413448106637436823436667486490500609860454569897435532241357155207279640348613391925869356707085716313629427039108173499116070752934663057170826924394097039656996533380633441327789606544536419778730572604777021472687228198350586129397400592412319240952063172020922119410672915823833748251436572744335164897064545511255007434399587");


        BigInteger D1 = Attaque(E1,N1);
        System.out.println("message : "  + BI2M(RSA.dechiffrementRsa(C1,D1,N1)));
        BigInteger[] inter1 = calculatePandQWithD(D1,E1,N1);
        assert (inter1[0].multiply(inter1[1]).equals(N1));
        System.out.println("P == " +inter1[0] + "  Q == " + inter1[1]);
        // -----------------------Challenge 2 ---------------------------//
        BigInteger N2 = new BigInteger("14289108516703255478538808825006798853467818397499055571194475779771983895441872962374468206460031963904232425313993584083664134365856037964465745966064255205422804394556027289717024708841665652601976293531724030282387073358647598479167622423051407114249846043587535076379445672765799635466431402870902650371282555175906949321638036307573084446090189954493961850976719527399383037327334086759834814525215971338965532580561232723425477920379888564166995988597428517018741897201659888167651416069995585184339852938619144368327665893288761344184074929143721646914223673085077279704461466623247294236930251518245828121723");
        BigInteger E2 = new BigInteger("8600258143570243292957178328764429796382057791138172825737796513965289818206294296191220690354511903937996083524546560276786987725460141913858247849305919832814128794265313209816290767419050494697191588412726841731690102814580877457264079613413729088933458385701759441700482008196653695810117075545988818502492316723298214032400856786226393010619589169524385302914958833846138745379089668808320328552221100758915940782521518286655396645276488471418229622301263471568097253575592382575672609798406535238385692604143420358702611563164920304627154057543105649171865701285537241401215877214710275668417530676860427629841");
        BigInteger C2 = new BigInteger("7249010264130697033936099041871866136369732569026728579645935985043375495183747520608794083611730312354906551866585749498356406263468410650854218309132711691806005103752417072543124554947100067611252146533342986776988586424056023820082554235282293740184079088202640768435138778300836359426737176566321392883166161987812406997737914488776380906700527120228844217307367476072106256592168792918979054201404746767701455521148340072714639884802907867522424864923057951437847176846891844992581004741370912173276320683963010107867665723003322943376437314851578307700775446941519997334539107243741270572328003605208919773488");
        BigInteger D2 = Attaque(E2,N2);

        System.out.println("message : "  + BI2M(RSA.dechiffrementRsa(C2,D2,N2)));
        BigInteger[] inter2 = calculatePandQWithD(D2,E2,N2);
        assert (inter2[0].multiply(inter2[1]).equals(N2));
        System.out.println("P == " +inter2[0] + "  Q == " + inter2[1]);
        // -----------------------Challenge 3 ---------------------------//
        BigInteger E3 = new BigInteger("8042758924052909416479844993713876687782344306637205812699441394039082323548995884022776919589408597843344671826583528847563088849259595316512325092721669586700537504788072234197581315566659828352306367765863589382057121125488263029931796444183550248523595308095017160067972465241384696845027038203412744164129527323206795001192925105403008840865950342727557855612148051696082301282867876308991388392019818989954396794013485971720716674802819004929064898032393418957077438034806282475712308120249852117541525394483026009561296916708153202540669924212322362097506289960258203203803885795866394801484916672368247984527");
        BigInteger N3 = new BigInteger("24727834114902344293191933049288576325058555828381063501223152691038908981931661640808487553671450573778184925022340386579449041681641630360247656203205915400233473931824217272892194044135776304611327180010983305256608087930558628961847253898834641645897137815971549768218613497928646215196337019065400860394952007927576855635096825336505340062069791361348632101303892990299097735510911994395269168475019797428133529218477028682400035610725633847060251032900386952861558541568150310303448957721336304264790382057697614069840898030792680630269079446126769388983957636861220270846568679027627298781956276554570950203863");
        BigInteger C3 = new BigInteger("15898323189070509757011516842689444765020597936483428313063982412915588688229102304671119207124333094261023868429856734818950322265016944829826364063417158808259776904874984574272713697035340008157163408599827465498500380905807331265119441473704216876009952658596857439220913027723127046726487193253426709875403302604978112553886353995456931454077851169603397571783727340145273956900212400785489723145739780745726385637509204613732047307301543866225647809460768833050682617247471751220379458502811673686306801361518329993104696747471007271679399800028760777701547107115055303125957686500802618239142690993784634623505");
        BigInteger D3 = Attaque(E3,N3);

        System.out.println("message : "  + BI2M(RSA.dechiffrementRsa(C3,D3,N3)));
        BigInteger[] inter3 = calculatePandQWithD(D3,E3,N3);
        assert (inter3[0].multiply(inter3[1]).equals(N3));
        System.out.println("P == " +inter3[0] + "  Q == " + inter3[1]);
        // -----------------------Challenge 4 ---------------------------//
        BigInteger E4 = new BigInteger("2386827697658171847852129997137685220321137075359460863779818326590875278835758381821160644694978470666902382487911695587279090143794238135881969018529963055110153509354816437636257938528318424678484349408395372018924329039139804046805887573450208317753174788207359259992076023776672342042753203514539038181343236537918296372536811689680900526626912218235109936434699593767387653021216239462314710373500245180550108227779959557950898777626018612282753698814272297576739532514752457213141539171001040794862506373888099767200767695880556199698695070360255471461678250852450854863775391870333337781855408860802334955007");
        BigInteger N4 = new BigInteger("17922346774785828393739054453908520286100304302618288897380881730077910888756937634555764773720444601391493865652194974110340295794161190721719434667164946107179201937706173476591743696449061920597408513034190845118598393149125900899135403942674241080835733247770310339198243955810145259471182778755795604756606439829814532694946304765664798391628283995179756138277530431681973458309049489566160456610522643525567756833499148723984969261817073055872937586483525448980541270591481241021743974726116772458214373521172076918634086681697844619285923721080013365498793965907410038404124211189329817407804498774597130182851");
        BigInteger C4 = new BigInteger("16442052418667850234121153205322495052231627911423004478814599949747107598914470770341766290539020047547108681160285424679717659333995817054605711232165838763393771208577093540793738485345985737246665708231641053295858004543308516741427683820181331774473025056924951020337918263944163348327719227937337445363369306134462679710955829954228980097960668821573884146940806345413582206029767887736431135938609950959418362817819656227411674747332554510067958919708894741051718736845502599389258384564234994641298429771128008851960347765707390269263195407554788989811815988283186045994592315753563147582374149423380751637144");
        BigInteger D4 = Attaque(E4,N4);

        System.out.println("message : "  + BI2M(RSA.dechiffrementRsa(C4,D4,N4)));
        BigInteger[] inter4 = calculatePandQWithD(D4,E4,N4);
        assert (inter4[0].multiply(inter4[1]).equals(N4));
        System.out.println("P == " +inter4[0] + "  Q == " + inter4[1]);
        // -----------------------Challenge 5 ---------------------------//

        BigInteger E5 = new BigInteger("14274587226893404013509076551000389068796554973304448436086797402302027837003262127649501635802863531962207484649058593985330801185438907139473885890836121118507661521821259307324404656948732553691528336959004908399820560702007346107021170560127713677944722516254693569152847374869688616259800907385152658679341561011142465004412290257916111860494421925503766834674656279129018111154329762745312586750057827561599172168790424071813634497881043419404335664745000569557338452768128803838411089127686248504121563937007799435653015475436331396074899531611837905599539281079329812972466478723999213304856536164366966505891");
        BigInteger N5 = new BigInteger("26097671695808496244855154470989041916111880849148817271412591072244123230765772594098538808548577872277355348117467843046441132695952774759164271854739690409910863556006947342251145139443584610429103572011994941485807069637779740701247410013683357523969507313153350494603524198852341982523478559454423190058386311275204403547433869140554771473029936210606855701395664999161350064139620151252955083525950417994105058871815116607642261901193088729871629962627468679310325040100139840410970019478681155001324491440098912066904089340611682843840365157417090223605015164060963216103270949393052452592152805304697590445381");
        BigInteger C5 = new BigInteger("14416795327113130659958099397828380073307351108403177832058464227333425658505980469276491157920925545686954965419583355597677508738298728770714707294403880205164164476106326450969653578153595718414286648493963590676504977013021227654004412921360382532559192821883370966337824744600457810093264540590571643011694116516765704934909932394621959225633454269899918425161430441623772989939935038460133848325982521709092864179714779510310518112795758480444280130131770537009791368316896282776974760164342189305878532927482067446627056442192085325101870840465971498936665491868700126063265082934543022606992345619297671751847");

        BigInteger D5 = Attaque(E5,N5);

        System.out.println("message : "  + BI2M(RSA.dechiffrementRsa(C5,D5,N5)));
        BigInteger[] inter5 = calculatePandQWithD(D5,E5,N5);
        assert (inter5[0].multiply(inter5[1]).equals(N5));
        System.out.println("P == " +inter5[0] + "  Q == " + inter5[1]);

        // -----------------------Challenge 6 ---------------------------//
        BigInteger E6 = new BigInteger("4290168712859312564672881669923619146114213453939289560490378629127320665118858487558967983457618792332978880915357517180495915858311859470347852047724124827034668463238829208246163202481822519739540022821706786413648047052657690298998303240002691055370526165918570937329171065243173728579644125934757095901216952625407905356428346721573658951463319186520176124031212053241398771137870172747164751359471549283551390443230036654151232565146581018309492130900119773491382233297389297066459652572903413995624902423593761799759243135220948186851359492017524157182773282628762356862141998132410851473539313338314364254353");
        BigInteger N6 = new BigInteger("19243958133266728302039092524719226766921745623848259716134745216370030767009453321423898713958875605022570098158623954066779266348324643529279069251953447792388142543772741931900733498187174466624789327313382312098697445889128805844704107583286319617215133028515226030734511429686172393586612129721654021179206552564608499006305805534791391952918835355944957132440164879943481367077476714943085980376993405815828149473730669795497196087543832363001259251546106632950775274345458957219181213050456034193522399393703202666096946352726168786882471859361057020380456283712591546732415393875634045825465566320187336277049");
        BigInteger C6 = new BigInteger("18891674413136260017209395682926168631134398369848146569671433926482349001724180896883588578401834820028444978785318466276788893159504634122283492374328804426247017867543601213968467302037790141402925351299600023149342215811323160920465166008023304470521285280835751849306598038079262372572553498748663482841339112857024240775844520120346067195435551830803540803115854740775607914022370893622832592883913927425447118814518476379233853136329860959055868340623416393814702737666981748043696542817779208057991966919551182487636293039741357887364817447417496830241911040893260187049838165611878356997930243707438294896485");
        BigInteger D6 = Attaque(E6,N6);

        System.out.println("message : "  + BI2M(RSA.dechiffrementRsa(C6,D6,N6)));
        BigInteger[] inter6 = calculatePandQWithD(D6,E6,N6);
        assert (inter6[0].multiply(inter6[1]).equals(N6));
        System.out.println("P == " +inter6[0] + "  Q == " + inter6[1]);

        // -----------------------Challenge 7 ---------------------------//
        BigInteger E7 = new BigInteger("9359340361865488341092813295889237712033796986593344736609809048637893532531065073368416561109699822658353972450439838921672159479396490684224929316726544727253613896347914200701240599725070776477434919580293976266665839330830038376067550170698266166737290318255430948337934977204167380031690606192437214624021446833239947089091984686654001778255545674716692140867402734196920410718552181860840334677112239208519090083217135865270347031615848617887150069120920868617765769139358826525022232224301787732126548074120844112852231617377551944529021053749358369956079105544203420941268637031929800505244091086629181988163");
        BigInteger N7 = new BigInteger("24119899676870911180911124379315139327072723162608580859140865497280846196889441625116610141875816236197995055811092365507247820500859167654564423502013294158821167618518347998978229552776322153310459103006808973017456269838117315060638117751945080477944714061305813209177793641740033277134591625928926716017696403739909632781332325143553435180220605750651344948172603621924328645849588068696502504624611807495089471114796260221369987563656458688379267404634222558562750697191165234199603050933897610782521587652290279116297602202124182108928097861128216834374009167642447183392853194856126999259442758081011888290967");
        BigInteger C7 = new BigInteger("5932977186315303379924205702822448794598709169754867339863422311290567842880611888156172335338703825165180564293185917019435246003413563851094343664166651288621636685463569756778340680691360580745108832242448913891457778572426880064748445182866248252320424689218589052563605284311737344284017215999134979589057309468026888775188027300701725156873320034240396400116784115765629430332117329926803011596302537865973554547359242450579722201843283927063184694764465093359559884956684443251405964445135358147747189284893534491472868626281528419440915367173840157117622877325337912903548536048386154005384387472784125467293");
        BigInteger D7 = Attaque(E7,N7);

        System.out.println("message : "  + BI2M(RSA.dechiffrementRsa(C7,D7,N7)));
        BigInteger[] inter7 = calculatePandQWithD(D7,E7,N7);
        assert (inter7[0].multiply(inter7[1]).equals(N7));
        System.out.println("P == " +inter7[0] + "  Q == " + inter7[1]);

        // -----------------------Challenge 8---------------------------//

        BigInteger E8 = new BigInteger("15938558376666350481780515754091010072278826031280267682755840225150140608113574126681474524987233939260880034713206039887827542402479892817688878762005507444949784486083303281154525333457590164951542820062292486459097441093475564664208155802329105436249672165443118515507686460555249708937848744420191907764863459447391732039320663097566051554133216139122083313551211675556153149235996663530041602952179969203757319040884778573493544091644056445187981332786249555627032793331552594985189185449621325601190196389188205933684004991280443316712844164579547207853865835971560278274080542468522623613709702019544402343297");
        BigInteger N8 = new BigInteger("17275677544712067970064483524280320610824008080712843562337718955217071972591972902157664168845310820557174548755923515658121457744459188922139121225919296819425343499407174720510440688975555640021402669939367764650587091595446492291117146772684226605279612136248247735254491015750784920415725844917457586910190289180907296220662092082296898226951221131724204400471801240989956195265011725513943917133852820686884382309968949818416607197126601331099199277674661314376962738535269326988201336621895681806498536320791629874504605240586484132713669090647420058016408014474029556887519007872005046393823347418275700560691");
        BigInteger C8 = new BigInteger("6414196926653041422058632340238238741109718971620194539236315732773262977383463084547420660543329538542298027701399994011994245346747083421623496547594280159368394404441220517017150915455273054569724680020216812246310769475430840857166172043184766352581649431358083909966394631499236314435695403180220554778905439527608819358530481233723096551648713485747478291294408477370629799379401292531665909047324734641325694946182414294569697953153650331392682178119904647327305479958646004897934903194536730503455958237486329191504678465813021314026338071989340441940432164955517429962839548011520475338393627312471074776658");
        BigInteger D8 = Attaque(E8,N8);

        System.out.println("message : "  + BI2M(RSA.dechiffrementRsa(C8,D8,N8)));
        BigInteger[] inter8 = calculatePandQWithD(D8,E8,N8);
        assert (inter8[0].multiply(inter8[1]).equals(N8));
        System.out.println("P == " +inter8[0] + "  Q == " + inter8[1]);
    }
}