package csv2html;

import static java.lang.System.err;
import java.io.IOException;

import org.junit.Test;

public class testCsv2html {

	@Test
	public void test() {
		String input = "test.csv";
		String output = "result.html";
		String[] cssClasses = new String[]{"class1","class2","class3", "class4", "class5", "class6", "class7"};
		CSVToHTML converter = new CSVToHTML();
		try {
			converter.csv2html(input, output, "ASCII", cssClasses, true, true);
		} catch ( Exception e )
        {
        err.println();
        e.printStackTrace( err );
        err.println( "Failed to export " + input );
        err.println();
        }
	}

	//*******************************************************************
/*-<TestCase id="0">

<Has name="properties" value="EntreGuillemetsDouble,sanscomentaire,validInputName"/>


-<Input type="arg">

<Var name="infilename.extension" value="File is csv"/>

<Var name="OutFilename.name" value="null"/>

<Var name="Encoding.type" value="null"/>

<Var name="CssClasses.size" value="null"/>

<Var name="CompleteHtml.value" value="true"/>

<Var name="Header.Hasheader" value="true"/>

<Var name="CSVFile.ComptenuDesChamps" value="ContientVirgule"/>

<Var name="CSVFile.SeparationDesChamps" value="EntreGuillemetsDouble"/>

<Var name="CSVFile.PremiereLigne" value="sanscomentaire"/>

</Input>

</TestCase>
*/
	@Test
	public void test0() {
		String input = "test0.csv";
		String output = null;
		String[] cssClasses = null;
		CSVToHTML converter = new CSVToHTML();
		try {
			converter.csv2html(input, output, null, cssClasses, true, true);
		} catch ( Exception e )
        {
        err.println();
        e.printStackTrace( err );
        err.println( "Failed to export " + input );
        err.println();
        }
	}
	
	/*-<TestCase id="1">

<Has name="properties" value="EntreGuillemetsDouble,validInputName"/>


-<Input type="arg">

<Var name="infilename.extension" value="File is csv"/>

<Var name="OutFilename.name" value="name-specified"/>

<Var name="Encoding.type" value="Utf-8"/>

<Var name="CssClasses.size" value="size>0"/>

<Var name="CompleteHtml.value" value="false"/>

<Var name="Header.Hasheader" value="false"/>

<Var name="CSVFile.ComptenuDesChamps" value="ContientGuillemetsDouble"/>

<Var name="CSVFile.SeparationDesChamps" value="EntreGuillemetsDouble"/>

<Var name="CSVFile.PremiereLigne" value="aUnComentaire"/>

</Input>

*/
	@Test
	public void test1() {
		String input = "test1.csv";
		String output = "report.html";
		String[] cssClasses = new String[]{"class1","class2","class3", "class4", "class5", "class6", "class7"};
		CSVToHTML converter = new CSVToHTML();
		try {
			converter.csv2html(input, output, null, cssClasses, false, false);
		} catch ( Exception e )
        {
        err.println();
        e.printStackTrace( err );
        err.println( "Failed to export " + input );
        err.println();
        }
	}
	
	
	
	/*-<TestCase id="2">

<Has name="properties" value="validInputName"/>


-<Input type="arg">

<Var name="infilename.extension" value="File is csv"/>

<Var name="OutFilename.name" value="null"/>

<Var name="Encoding.type" value="Windows-1252"/>

<Var name="CssClasses.size" value="size>0"/>

<Var name="CompleteHtml.value" value="false"/>

<Var name="Header.Hasheader" value="false"/>

<Var name="CSVFile.ComptenuDesChamps" value="Contient tout autre carachtere"/>

<Var name="CSVFile.SeparationDesChamps" value="SimplementEntreVirgule"/>

<Var name="CSVFile.PremiereLigne" value="aUnComentaire"/>

</Input>

</TestCase>
*/
	@Test
	public void test2() {
		String input = "test.csv";
		String output = null;
		String[] cssClasses =  new String[]{"class1","class2","class3", "class4", "class5", "class6", "class7"};
		CSVToHTML converter = new CSVToHTML();
		try {
			converter.csv2html(input, output, "windows-1252", cssClasses, false, false);
		} catch ( Exception e )
        {
        err.println();
        e.printStackTrace( err );
        err.println( "Failed to export " + input );
        err.println();
        }
	}
	
	/*-<TestCase id="3">

<Has name="properties" value="EntreGuillemetsDouble,sanscomentaire,validInputName"/>


-<Input type="arg">

<Var name="infilename.extension" value="File is csv"/>

<Var name="OutFilename.name" value="null"/>

<Var name="Encoding.type" value="Utf-8"/>

<Var name="CssClasses.size" value="null"/>

<Var name="CompleteHtml.value" value="true"/>

<Var name="Header.Hasheader" value="true"/>

<Var name="CSVFile.ComptenuDesChamps" value="ContientGuillemetsDouble"/>

<Var name="CSVFile.SeparationDesChamps" value="EntreGuillemetsDouble"/>

<Var name="CSVFile.PremiereLigne" value="sanscomentaire"/>

</Input>

</TestCase>*/
	
	@Test
	public void test3() {
		String input = "test3.csv";
		String output = null;
		String[] cssClasses =  null;
		CSVToHTML converter = new CSVToHTML();
		try {
			converter.csv2html(input, output, "utf-8", cssClasses, true, true);
		} catch ( Exception e )
        {
        err.println();
        e.printStackTrace( err );
        err.println( "Failed to export " + input );
        err.println();
        }
	}
/*-<TestCase id="4">

<Has name="properties" value="EntreGuillemetsDouble,sanscomentaire,validInputName"/>


-<Input type="arg">

<Var name="infilename.extension" value="File is csv"/>

<Var name="OutFilename.name" value="name-specified"/>

<Var name="Encoding.type" value="null"/>

<Var name="CssClasses.size" value="null"/>

<Var name="CompleteHtml.value" value="true"/>

<Var name="Header.Hasheader" value="true"/>

<Var name="CSVFile.ComptenuDesChamps" value="ContientVirgule"/>

<Var name="CSVFile.SeparationDesChamps" value="EntreGuillemetsDouble"/>

<Var name="CSVFile.PremiereLigne" value="sanscomentaire"/>

</Input>

</TestCase>*/
	@Test
	public void test4() {
		String input = "test4.csv";
		String output = "result.html";
		String[] cssClasses = null;
		CSVToHTML converter = new CSVToHTML();
		try {
			converter.csv2html(input, output, null, cssClasses, true, true);
		} catch ( Exception e )
        {
        err.println();
        e.printStackTrace( err );
        err.println( "Failed to export " + input );
        err.println();
        }
	}
/*-<TestCase id="5">

<Has name="properties" value="sanscomentaire,validInputName"/>


-<Input type="arg">

<Var name="infilename.extension" value="File is csv"/>

<Var name="OutFilename.name" value="name-specified"/>

<Var name="Encoding.type" value="Windows-1252"/>

<Var name="CssClasses.size" value="null"/>

<Var name="CompleteHtml.value" value="true"/>

<Var name="Header.Hasheader" value="true"/>

<Var name="CSVFile.ComptenuDesChamps" value="Contient tout autre carachtere"/>

<Var name="CSVFile.SeparationDesChamps" value="SimplementEntreVirgule"/>

<Var name="CSVFile.PremiereLigne" value="sanscomentaire"/>

</Input>

</TestCase>*/
	@Test
	public void test5() {
		String input = "test.csv";
		String output = null;
		String[] cssClasses =  new String[]{"class1","class2","class3", "class4", "class5", "class6", "class7"};
		CSVToHTML converter = new CSVToHTML();
		try {
			converter.csv2html(input, output, "windows-1252", cssClasses, false, false);
		} catch ( Exception e )
        {
        err.println();
        e.printStackTrace( err );
        err.println( "Failed to export " + input );
        err.println();
        }
	}
	/*-<TestCase id="6">

<Has name="properties" value="EntreGuillemetsDouble,validInputName"/>


-<Input type="arg">

<Var name="infilename.extension" value="File is csv"/>

<Var name="OutFilename.name" value="null"/>

<Var name="Encoding.type" value="null"/>

<Var name="CssClasses.size" value="size>0"/>

<Var name="CompleteHtml.value" value="false"/>

<Var name="Header.Hasheader" value="false"/>

<Var name="CSVFile.ComptenuDesChamps" value="ContientGuillemetsDouble"/>

<Var name="CSVFile.SeparationDesChamps" value="EntreGuillemetsDouble"/>

<Var name="CSVFile.PremiereLigne" value="aUnComentaire"/>

</Input>

</TestCase>*/
	@Test
	public void test6() {
		String input = "test6.csv";
		String output = null;
		String[] cssClasses =  new String[]{"class1","class2","class3", "class4", "class5", "class6", "class7"};
		CSVToHTML converter = new CSVToHTML();
		try {
			converter.csv2html(input, output, null, cssClasses, false, false);
		} catch ( Exception e )
        {
        err.println();
        e.printStackTrace( err );
        err.println( "Failed to export " + input );
        err.println();
        }
	}
	/*-<TestCase id="7">

<Has name="properties" value="sanscomentaire,validInputName"/>


-<Input type="arg">

<Var name="infilename.extension" value="File is csv"/>

<Var name="OutFilename.name" value="name-specified"/>

<Var name="Encoding.type" value="null"/>

<Var name="CssClasses.size" value="size>0"/>

<Var name="CompleteHtml.value" value="true"/>

<Var name="Header.Hasheader" value="true"/>

<Var name="CSVFile.ComptenuDesChamps" value="Contient tout autre carachtere"/>

<Var name="CSVFile.SeparationDesChamps" value="SimplementEntreVirgule"/>

<Var name="CSVFile.PremiereLigne" value="sanscomentaire"/>

</Input>

</TestCase>*/
	@Test
	public void test7() {
		String input = "test7.csv";
		String output = null;
		String[] cssClasses = null;
		CSVToHTML converter = new CSVToHTML();
		try {
			converter.csv2html(input, output, "utf-8", cssClasses, false, false);
		} catch ( Exception e )
        {
        err.println();
        e.printStackTrace( err );
        err.println( "Failed to export " + input );
        err.println();
        }
	}
	/*-<TestCase id="8">

<Has name="properties" value="EntreGuillemetsDouble,validInputName"/>


-<Input type="arg">

<Var name="infilename.extension" value="File is csv"/>

<Var name="OutFilename.name" value="null"/>

<Var name="Encoding.type" value="Utf-8"/>

<Var name="CssClasses.size" value="null"/>

<Var name="CompleteHtml.value" value="false"/>

<Var name="Header.Hasheader" value="false"/>

<Var name="CSVFile.ComptenuDesChamps" value="ContientVirgule"/>

<Var name="CSVFile.SeparationDesChamps" value="EntreGuillemetsDouble"/>

<Var name="CSVFile.PremiereLigne" value="aUnComentaire"/>

</Input>

</TestCase>*/
	@Test
	public void test8() {
		String input = "test8.csv";
		String output = null;
		String[] cssClasses =  null;
		CSVToHTML converter = new CSVToHTML();
		try {
			converter.csv2html(input, output, "utf-8", cssClasses, false, false);
		} catch ( Exception e )
        {
        err.println();
        e.printStackTrace( err );
        err.println( "Failed to export " + input );
        err.println();
        }
	}
	/*-<TestCase id="9">

<Has name="properties" value="validInputName"/>


-<Input type="arg">

<Var name="infilename.extension" value="File is csv"/>

<Var name="OutFilename.name" value="name-specified"/>

<Var name="Encoding.type" value="Utf-8"/>

<Var name="CssClasses.size" value="size>0"/>

<Var name="CompleteHtml.value" value="true"/>

<Var name="Header.Hasheader" value="false"/>

<Var name="CSVFile.ComptenuDesChamps" value="Contient tout autre carachtere"/>

<Var name="CSVFile.SeparationDesChamps" value="SimplementEntreVirgule"/>

<Var name="CSVFile.PremiereLigne" value="aUnComentaire"/>

</Input>

</TestCase>*/
	@Test
	public void test9() {
		String input = "test9.csv";
		String output = null;
		String[] cssClasses =  new String[]{"class1","class2","class3", "class4", "class5", "class6", "class7"};
		CSVToHTML converter = new CSVToHTML();
		try {
			converter.csv2html(input, output, "utf-8", cssClasses, true, false);
		} catch ( Exception e )
        {
        err.println();
        e.printStackTrace( err );
        err.println( "Failed to export " + input );
        err.println();
        }
	}
	/*-<TestCase id="10">

<Has name="properties" value="EntreGuillemetsDouble,sanscomentaire,validInputName"/>


-<Input type="arg">

<Var name="infilename.extension" value="File is csv"/>

<Var name="OutFilename.name" value="name-specified"/>

<Var name="Encoding.type" value="Windows-1252"/>

<Var name="CssClasses.size" value="size>0"/>

<Var name="CompleteHtml.value" value="false"/>

<Var name="Header.Hasheader" value="true"/>

<Var name="CSVFile.ComptenuDesChamps" value="ContientVirgule"/>

<Var name="CSVFile.SeparationDesChamps" value="EntreGuillemetsDouble"/>

<Var name="CSVFile.PremiereLigne" value="sanscomentaire"/>

</Input>

</TestCase>*/
	@Test
	public void test10() {
		String input = "test10.csv";
		String output = "report.html";
		String[] cssClasses =  new String[]{"class1","class2","class3", "class4", "class5", "class6", "class7"};
		CSVToHTML converter = new CSVToHTML();
		try {
			converter.csv2html(input, output, "windows-1252", cssClasses, false, true);
		} catch ( Exception e )
        {
        err.println();
        e.printStackTrace( err );
        err.println( "Failed to export " + input );
        err.println();
        }
	}
	/*<TestCase id="11">

<Has name="properties" value="EntreGuillemetsDouble,sanscomentaire,validInputName"/>


-<Input type="arg">

<Var name="infilename.extension" value="File is csv"/>

<Var name="OutFilename.name" value="name-specified"/>

<Var name="Encoding.type" value="Windows-1252"/>

<Var name="CssClasses.size" value="null"/>

<Var name="CompleteHtml.value" value="true"/>

<Var name="Header.Hasheader" value="false"/>

<Var name="CSVFile.ComptenuDesChamps" value="ContientGuillemetsDouble"/>

<Var name="CSVFile.SeparationDesChamps" value="EntreGuillemetsDouble"/>

<Var name="CSVFile.PremiereLigne" value="sanscomentaire"/>

</Input>

</TestCase>*/
	@Test
	public void test11() {
		String input = "test11.csv";
		String output = "report.html";
		String[] cssClasses =  null;
		CSVToHTML converter = new CSVToHTML();
		try {
			converter.csv2html(input, output, "windows-1252", cssClasses, true, false);
		} catch ( Exception e )
        {
        err.println();
        e.printStackTrace( err );
        err.println( "Failed to export " + input );
        err.println();
        }
	}
	/*-<TestCase id="12">

<Has name="properties" value="EntreGuillemetsDouble,sanscomentaire,validInputName"/>


-<Input type="arg">

<Var name="infilename.extension" value="File is csv"/>

<Var name="OutFilename.name" value="null"/>

<Var name="Encoding.type" value="null"/>

<Var name="CssClasses.size" value="null"/>

<Var name="CompleteHtml.value" value="false"/>

<Var name="Header.Hasheader" value="true"/>

<Var name="CSVFile.ComptenuDesChamps" value="Contient tout autre carachtere"/>

<Var name="CSVFile.SeparationDesChamps" value="EntreGuillemetsDouble"/>

<Var name="CSVFile.PremiereLigne" value="sanscomentaire"/>

</Input>

</TestCase>*/
	@Test
	public void test12() {
		String input = "test12.csv";
		String output = null;
		String[] cssClasses =  null;
		CSVToHTML converter = new CSVToHTML();
		try {
			converter.csv2html(input, output, null, cssClasses, false, true);
		} catch ( Exception e )
        {
        err.println();
        e.printStackTrace( err );
        err.println( "Failed to export " + input );
        err.println();
        }
	}
	
	/*-<TestCase id="13" failure="true">


-<Input type="arg">

<Var name="infilename.extension" value="null" failure="true"/>

<Var name="OutFilename.name" value="name-specified"/>

<Var name="Encoding.type" value="null"/>

<Var name="CssClasses.size" value="null"/>

<Var name="CompleteHtml.value" value="false"/>

<Var name="Header.Hasheader" value="false"/>

<Var name="CSVFile.ComptenuDesChamps" value="Contient tout autre carachtere"/>

<Var name="CSVFile.SeparationDesChamps" value="SimplementEntreVirgule"/>

<Var name="CSVFile.PremiereLigne" value="aUnComentaire"/>

</Input>

</TestCase>*/
	
	@Test
public void test13() {
		String input = null;
		String output = "result.html";
		String[] cssClasses =  null;
		CSVToHTML converter = new CSVToHTML();
		try {
			converter.csv2html(input, output, null, cssClasses, false, false);
		} catch (IllegalArgumentException | IOException e )
        {
        err.println();
        e.printStackTrace( err );
        err.println( "Failed to export " + input );
        err.println();
        }
}
	/*-<TestCase id="14" failure="true">


-<Input type="arg">

<Var name="infilename.extension" value="File not csv" failure="true"/>

<Var name="OutFilename.name" value="name-specified"/>

<Var name="Encoding.type" value="null"/>

<Var name="CssClasses.size" value="null"/>

<Var name="CompleteHtml.value" value="false"/>

<Var name="Header.Hasheader" value="false"/>

<Var name="CSVFile.ComptenuDesChamps" value="Contient tout autre carachtere"/>

<Var name="CSVFile.SeparationDesChamps" value="SimplementEntreVirgule"/>

<Var name="CSVFile.PremiereLigne" value="aUnComentaire"/>

</Input>

</TestCase>*/
	@Test
	public void test14() {
		String input = "test14.html";
		String output = "report.html";
		String[] cssClasses =  null;
		CSVToHTML converter = new CSVToHTML();
		try {
			converter.csv2html(input, output, null, cssClasses, false, true);
		} catch ( Exception e )
        {
        err.println();
        e.printStackTrace( err );
        err.println( "Failed to export " + input );
        err.println();
        }
	}

}
