import java.util.*;
public class Tranzitie{
private String st_inceput;
private char simbol;
private String st_sfarsit;
private String output;

Tranzitie( String st_inceput,char simbol,String st_sfarsit)
{
this.st_inceput=st_inceput;
this.simbol=simbol;
this.st_sfarsit=st_sfarsit;
this.output="";
}

Tranzitie (String st_inceput ,char simbol ,String output,String st_sfarsit)
{
    this.st_inceput=st_inceput;
    this.simbol=simbol;
    this.output=output;
    this.st_sfarsit=st_sfarsit;
    
}

String spuneStInceput(){
return this.st_inceput;
}

char spuneSimbol(){
return this.simbol;
}

String spuneStSfarsit()
{
return this.st_sfarsit;
}

String spuneOutput()
{
    return this.output;
}
}
