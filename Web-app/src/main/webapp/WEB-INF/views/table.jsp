<!doctype html>
<html>
<head>

<style>
   
    table,th{
        border: 1px solid black;
        border-collapse: collapse;
          padding:1%;
        table-layout: auto;
        background-color: azure;
    }
    table{
    width:25%;
    }
    
</style>
<script>
    var c,c1;
    function validation(){        
        var name=document.getElementById("N1").value;
        var Lsname=document.getElementById("N2").value;
        var Nub=document.getElementById("N19").value;
        var EM=document.getElementById("N3").value;
        var RL=document.getElementById("N4").value;
        var CL=document.getElementById("N5").value;

		FName(name);
		Lname(Lsname);
        Num(Nub);
        Email(EM);
        Role(RL);
        Client(CL);
        
    }  
    function FName(x)
	{
        if(x == '')
		{
            document.getElementById("ch").innerHTML="First Name is required"
        }
    }
    function Lname(x)
	{ 
		if(x == '')
		{
            document.getElementById("ch1").innerHTML="Last Name is required"       
        }
        
    }
   function Num(x){
        if(x == '')
		{
            document.getElementById("ch2").innerHTML= "Number is required";       
        }
        
    }
    function Email(x){
          if(x == '')
		{
            document.getElementById("ch3").innerHTML= "Email is required";       
        }    
    }
   function Role(x){
          if(x == '')
		{
            document.getElementById("ch4").innerHTML= "Role is required";       
        }    
        
    }
    function Client(x){
          if(x == '')
		{
            document.getElementById("ch5").innerHTML= "Client is required";       
        }    
        
    }


    
    </script>
</head>
<body>
<form action="/table" method="post">

    <p style="color: red" id="ch" >  </p>
    <p style="color: red" id="ch1" >  </p>
    <p style="color: red" id="ch2" >  </p>
    <p style="color: red" id="ch3" >  </p>
    <p style="color: red" id="ch4" >  </p>
    <p style="color: red" id="ch5" >  </p>
    <br>
    <table >
        <tr>
        <th >First Name:</th>
                <th><input name="name" type="text" id="N1">
                   
            </th>
        </tr>
        <tr>
            <th  >Last Name:</th>
            <th ><input type="text" id="N2"> </th>
         </tr>  
        <tr>
            <th> Phone Number:</th>
            <th><input type="tel" id="N19"></th>
        </tr>
         <tr>
             <th class="Email" >Email:</th>
                <th class="Email"><input type="email" id="N3"> </th>   
        </tr>
        <tr>
             <th >Role:</th>
                <th><input type="text" id="N4"> </th>
        </tr>
        
        <tr align="left">
             <th>Select one group:</th>
                <th style="text-align-last: justify" >Client <input list="Client" id="N5">
    <datalist id="Client">
    <option value="Anthem">
    <option value="CirrusLabs">
    <option value="info">
    <option value="cop">
    <option value="mat">
  </datalist>
                    <br>
                Aco 
                    <select id="N6" style="width:70% ">
  <option >AC1</option>
  <option >AC2</option>
  <option >AC3</option>
  
                    </select>
                    <br>
                Program <select id="N77" style="width:70% ">
  <option >ACc1</option>
  <option >ACc2</option>
  <option >ACc3</option>
  
                       </select>
            </th>     
        </tr>
        <tr>
            <th >Orbit Reports:
            </th>
            <th>
             <select id="N7" multiple style="width:70% " >
  <option >ACcw1</option>
  <option >ACce2</option>
  <option >ACcw3</option>
                </select>     
         </th>
                
        </tr>    
    </table>
    <br>
 <table >
     <tr>
     <th> User Name</th>
      <th> <input type = "text" id="N8" ></th>
     </tr> 
    </table >   
    <p> this is for anthem <input type=submit id="NS" onclick=validation()>
    </p>
    

    
</form>
</body>

</html>
    
    
