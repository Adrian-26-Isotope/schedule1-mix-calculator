# schedule1-mix-calculator
this is a mix calculator for the fantastic game <b>'Schedule 1'</b>. it calculates the ingredients for the highest profit product.

## game version
v0.3.4f8

## java version
21+

## execution
<ul>
 <li>
  either run the main function from 'MixCalulator' class
 </li>
 <li>
  or create a runnable jar and execute it,
 </li> 
 <li>
  or download one of the release jar files.
 </li>
</ul>
 dont forget to add the arguments when exeucting. to execute the jar file use the command "java -jar {filename}.jar {arg1} {arg2} {arg3}".

## arguments
 <b>1st arg: (mandatory) number of iterations</b> (number of desired mix iterations = number of ingredients)<br>
 <b>2nd arg: (optional) inital price</b> (helps to calculate highest profit)<br>
 <b>3rd arg: (optional) inital effect</b> (applicable e.g. for og kush and other weed variants)<br>

 ## data
 the data this calculator is based on, is coming from schedule-1.fandom.com. during testing i already found some discrepancies. there is no guarantee that all the results are correct.

## license
this project is licensed under the [MIT License](LICENSE.txt).

## examples
<b> og kush example </b><br>
input arguments: 2 38 CALMING<br>
output:
<pre>
HIGHEST MULTIPLIER
##################################################################################
multiplier: 2.4
price: 91
cost: 9
profit: 82
effects: [CYCLOPEAN, FOGGY, GLOWING]
ingredients:[CUKE, MEGA_BEAN]
##################################################################################

HIGHEST PROFIT
##################################################################################
multiplier: 2.4
price: 91
cost: 9
profit: 82
effects: [CYCLOPEAN, FOGGY, GLOWING]
ingredients:[CUKE, MEGA_BEAN]
##################################################################################
</pre>

<b> meth example </b><br>
input arguments: 3 70<br>
output:
<pre>
HIGHEST MULTIPLIER
##################################################################################
multiplier: 2.48
price: 173
cost: 22
profit: 151
effects: [TROPIC_THUNDER, ELECTRIFYING, LONG_FACED]
ingredients:[VIAGOR, ADDY, HORSE_SEMEN]
##################################################################################

HIGHEST PROFIT
##################################################################################
multiplier: 2.38
price: 166
cost: 13
profit: 153
effects: [TROPIC_THUNDER, CYCLOPEAN, FOGGY]
ingredients:[CUKE, VIAGOR, MEGA_BEAN]
##################################################################################
</pre>

<b> cocaine example </b><br>
input arguments: 4 150<br>
output:
<pre>
HIGHEST MULTIPLIER
##################################################################################
multiplier: 2.94
price: 441
cost: 27
profit: 414
effects: [ELECTRIFYING, LONG_FACED, CYCLOPEAN, FOGGY]
ingredients:[CUKE, ADDY, HORSE_SEMEN, MEGA_BEAN]
##################################################################################

HIGHEST PROFIT
##################################################################################
multiplier: 2.94
price: 441
cost: 20
profit: 421
effects: [ELECTRIFYING, LONG_FACED, CYCLOPEAN, FOGGY]
ingredients:[BANANA, CUKE, HORSE_SEMEN, MEGA_BEAN]
##################################################################################
</pre>

