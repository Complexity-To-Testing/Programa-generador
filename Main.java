package tfgGroupID.tfgArtefactID;
import java.util.ArrayList;
import java.io.IOException;
public class Main {
	public static double[] parse(String args) {
		String tmp_inputs=args;
		//String s="1,2,3,4,5,6,7,8,9,10,11,12,13";
		ArrayList<Double> tmp_inputs2=new ArrayList<Double>();
		int p=0;
		String num="";
		while(p<tmp_inputs.length()) {
			if(tmp_inputs.charAt(p)!=',') {
				num+=tmp_inputs.charAt(p);
			}else {
				if(num!="") {
					tmp_inputs2.add(new Double(num).doubleValue());
					num="";
				}
			}
			p++;
		}

		double[] test_inputs=new double[tmp_inputs2.size()];
		for (int i = 0; i < tmp_inputs2.size(); i++) {
			test_inputs[i]=tmp_inputs2.get(i);
			System.out.println(tmp_inputs2.get(i));
		}
		return test_inputs;
	}

	public static int[] parse2(String args) {
		String tmp_inputs=args;
		//String s="1,2,3,4,5,6,7,8,9,10,11,12,13";
		ArrayList<Integer> tmp_inputs2=new ArrayList<Integer>();
		int p=0;
		String num="";
		while(p<tmp_inputs.length()) {
			if(tmp_inputs.charAt(p)!=',') {
				num+=tmp_inputs.charAt(p);
			}else {
				if(num!="") {
					tmp_inputs2.add(new Integer(num).intValue());
					num="";
				}
			}
			p++;
		}

		int[] test_inputs=new int[tmp_inputs2.size()];
		for (int i = 0; i < tmp_inputs2.size(); i++) {
			test_inputs[i]=tmp_inputs2.get(i);
			System.out.println(tmp_inputs2.get(i));
		}
		return test_inputs;
	}

	public static void exe(String[] args ) {
		int num_ifs=(new Integer(args[0])).intValue();
		int num_while=new Integer(args[1]).intValue();
		int size_while=new Integer(args[2]).intValue();
		int num_for=new Integer(args[3]).intValue();
		int size_for=new Integer(args[4]).intValue();
		int size_cond=new Integer(args[5]).intValue();
		int size_expLogics=new Integer(args[6]).intValue();
		int size_expArit=new Integer(args[7]).intValue();
		double[] test_inputs=parse(args[8]);
		String ruta=args[9];
		String nom_test=args[10];
		String nom_program=args[11];
		int num_exp_seguida=new Integer(args[12]).intValue();
		int num_funcion=new Integer(args[13]).intValue();
		int[] decision_inputs=parse2(args[14]);//actualizdo
		int size_tests=new Integer(args[15]).intValue();
		int ifsAniCuerpoBucle=new Integer(args[16]).intValue();
		int aleatorio=new Integer(args[17]).intValue();
		int ini=new Integer(args[18]).intValue();
		int fin=new Integer(args[19]).intValue();


				System.out.println("<===============");
				System.out.println("num_ifs");
				System.out.println(num_ifs);
				System.out.println("num_while");
				System.out.println(num_while);
				System.out.println("size_while");
				System.out.println(size_while);
				System.out.println("num_for");
				System.out.println(num_for);
				System.out.println("size_for");
				System.out.println(size_for);
				System.out.println("size_cond");
				System.out.println(size_cond);
				System.out.println("size_expLogics");
				System.out.println(size_expLogics);
				System.out.println("size_expArit");
				System.out.println(size_expArit);
				System.out.println("test_inputs");

				for (int i = 0; i < test_inputs.length; i++) {
					System.out.println(test_inputs[i]);
				}

				System.out.println("ruta");
				System.out.println(ruta);
				System.out.println("nom_test");
				System.out.println(nom_test);
				System.out.println("nom_program");
				System.out.println(nom_program);
				System.out.println("num_exp_seguida");
				System.out.println(num_exp_seguida);
				System.out.println("num_funcion");
				System.out.println(num_funcion);
				System.out.println("decision_inputs");

				for (int i = 0; i < decision_inputs.length; i++) {
					System.out.println(decision_inputs[i]);
				}

				System.out.println("size_tests");
				System.out.println(size_tests);
				System.out.println("ifsAniCuerpoBucle");
				System.out.println(ifsAniCuerpoBucle);
				System.out.println("aleatorio");
				System.out.println(aleatorio);
				System.out.println("ini");
				System.out.println(ini);
				System.out.println("fin");
				System.out.println(fin);

				Generardor g=new Generardor(nom_test,nom_program,test_inputs,decision_inputs, num_ifs, num_while, size_while,  num_for,  size_for, size_cond,
							size_expLogics, size_expArit,num_exp_seguida,num_funcion,size_tests,ifsAniCuerpoBucle,ini,fin,aleatorio);

					for(int i=0; i<g.num_test_generado;i++) {
						GeneraFichero.crear(ruta,g.nom_tests[i]+".java",g.tests[i]);
					}

					GeneraFichero.crear(ruta,g.nom_program+".java",g.s);
	}

	public static void debug() {
		int num_ifs=3; //numero de iteracion
		int num_while=3;//numero de anidacion
		int size_while=3;//numero de iteracion
		int num_for=3;//numero de anidacion
		int size_for=3;//numero de iteracion
		int size_cond=3;
		int size_expLogics=3;
		int size_expArit=3;
		int size_inputs=100;
		double[] test_inputs=new double[size_inputs];
		for (int i = 0; i < size_inputs; i++) {
			test_inputs[i]=i;
		}
		int num_exp_seguida=1;
		int num_funcion=10;//{0,1,2,3..n-1}
		int size_dec_inputs=20;
		int[] decision_inputs= new int[size_dec_inputs];
		for (int i = 0; i < decision_inputs.length; i++) {
			decision_inputs[i]=i;
			System.out.println(decision_inputs[i]+":");
		}
		System.out.println("fin");
		int size_tests=10;
		int ifsAniCuerpoBucle=1;
		int aleatorio=1;//1: aleatorio, 0: no aleatorio
		int ini=1;
		int fin=1000;
		Generardor g=new Generardor("test","C",test_inputs,decision_inputs, num_ifs, num_while, size_while,  num_for,  size_for, size_cond,
				size_expLogics, size_expArit,num_exp_seguida,num_funcion,size_tests,ifsAniCuerpoBucle,ini,fin,aleatorio);

		/*
		System.out.println(g.s);
		System.out.println("%%%%%%%%%%%%%%%%%");
		System.out.println(g.programa_test);
		 */

		String route="C:/Users/yu/eclipse-workspace/TFG_local/src";
		for(int i=0; i<g.nom_tests.length;i++) {
			GeneraFichero.crear(route,g.nom_tests[i]+".java",g.tests[i]);
		}
		GeneraFichero.crear(route,g.nom_program+".java",g.s);


		//System.out.println("getWhile con 3:"+g.getWhiles(num_while,size_while,size_cond));
		//System.out.println("getFor con 3:"+g.getFors(num_anidado,num_iteracion));
		//System.out.println("getIfs con 3:"+g.getIfs(num_anidado));
		//System.out.println("exp_simple: "+g.exp_simple());
		//System.out.println("getIf anidado a dos: "+g.getIfs(2));
		//System.out.println("condIf: "+(g.condIf()));
		//System.out.println("condWhile: "+g.condWhile());
		//System.out.println("condFor: "+g.condFor(100));
		//System.out.println("exp_logic: "+g.exp_logic());
		//System.out.println("exp_logics: "+g.exp_logics(2));
		//System.out.println("exp_as: "+g.exp_as(3));
		//System.out.println("exp_a: "+g.exp_a());
		//System.out.println("op_art: "+g.op_art());
		//System.out.println("op_rel: "+g.op_rel());
		//System.out.println("op_logic: "+g.op_logic());
		//System.out.println("getNum: "+g.getNum());
		//System.out.println("getBool: "+g.getBool());

	}
	public static void main(String[] args) {
		// debug();
		exe(args);
	};
};
