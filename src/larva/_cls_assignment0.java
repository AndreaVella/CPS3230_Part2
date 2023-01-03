package larva;


import java.util.LinkedHashMap;
import java.io.PrintWriter;

public class _cls_assignment0 implements _callable{

public static PrintWriter pw; 
public static _cls_assignment0 root;

public static LinkedHashMap<_cls_assignment0,_cls_assignment0> _cls_assignment0_instances = new LinkedHashMap<_cls_assignment0,_cls_assignment0>();
static{
try{
RunningClock.start();
pw = new PrintWriter("C:\\Users\\User\\workspace\\CPS3230_Part_2/src/output_assignment.txt");

root = new _cls_assignment0();
_cls_assignment0_instances.put(root, root);
  root.initialisation();
}catch(Exception ex)
{ex.printStackTrace();}
}

_cls_assignment0 parent; //to remain null - this class does not have a parent!
int no_automata = 1;
 public boolean isLoggedInOnWebsite =false ;
 public int eventLogType =100 ;

public static void initialize(){}
//inheritance could not be used because of the automatic call to super()
//when the constructor is called...we need to keep the SAME parent if this exists!

public _cls_assignment0() {
}

public void initialisation() {
}

public static _cls_assignment0 _get_cls_assignment0_inst() { synchronized(_cls_assignment0_instances){
 return root;
}
}

public boolean equals(Object o) {
 if ((o instanceof _cls_assignment0))
{return true;}
else
{return false;}
}

public int hashCode() {
return 0;
}

public void _call(String _info, int... _event){
synchronized(_cls_assignment0_instances){
_performLogic_marketAlertUmProperty(_info, _event);
}
}

public void _call_all_filtered(String _info, int... _event){
}

public static void _call_all(String _info, int... _event){

_cls_assignment0[] a = new _cls_assignment0[1];
synchronized(_cls_assignment0_instances){
a = _cls_assignment0_instances.keySet().toArray(a);}
for (_cls_assignment0 _inst : a)

if (_inst != null) _inst._call(_info, _event);
}

public void _killThis(){
try{
if (--no_automata == 0){
synchronized(_cls_assignment0_instances){
_cls_assignment0_instances.remove(this);}
}
else if (no_automata < 0)
{throw new Exception("no_automata < 0!!");}
}catch(Exception ex){ex.printStackTrace();}
}

int _state_id_marketAlertUmProperty = 33;

public void _performLogic_marketAlertUmProperty(String _info, int... _event) {

_cls_assignment0.pw.println("[marketAlertUmProperty]AUTOMATON::> marketAlertUmProperty("+") STATE::>"+ _string_marketAlertUmProperty(_state_id_marketAlertUmProperty, 0));
_cls_assignment0.pw.flush();

if (0==1){}
else if (_state_id_marketAlertUmProperty==30){
		if (1==0){}
		else if ((_occurredEvent(_event,62/*viewAlerts*/)) && (isLoggedInOnWebsite ==true )){
		eventLogType =7 ;

		_state_id_marketAlertUmProperty = 32;//moving to state viewingAlert
		_goto_marketAlertUmProperty(_info);
		}
		else if ((_occurredEvent(_event,64/*postAlert*/))){
		eventLogType =0 ;
_cls_assignment0.pw .println ("Alert Posted");

		_state_id_marketAlertUmProperty = 30;//moving to state postedAlert
		_goto_marketAlertUmProperty(_info);
		}
		else if ((_occurredEvent(_event,66/*deleteAlerts*/))){
		eventLogType =1 ;
_cls_assignment0.pw .println ("Alerts Deleted");

		_state_id_marketAlertUmProperty = 31;//moving to state deletedAlert
		_goto_marketAlertUmProperty(_info);
		}
		else if ((_occurredEvent(_event,60/*logOut*/)) && (isLoggedInOnWebsite ==true )){
		isLoggedInOnWebsite =false ;
_cls_assignment0.pw .println ("Logged Out");

		_state_id_marketAlertUmProperty = 33;//moving to state loggedOut
		_goto_marketAlertUmProperty(_info);
		}
}
else if (_state_id_marketAlertUmProperty==31){
		if (1==0){}
		else if ((_occurredEvent(_event,62/*viewAlerts*/)) && (isLoggedInOnWebsite ==true )){
		eventLogType =7 ;

		_state_id_marketAlertUmProperty = 32;//moving to state viewingAlert
		_goto_marketAlertUmProperty(_info);
		}
		else if ((_occurredEvent(_event,64/*postAlert*/))){
		eventLogType =0 ;
_cls_assignment0.pw .println ("Alert Posted");

		_state_id_marketAlertUmProperty = 30;//moving to state postedAlert
		_goto_marketAlertUmProperty(_info);
		}
		else if ((_occurredEvent(_event,66/*deleteAlerts*/))){
		eventLogType =1 ;
_cls_assignment0.pw .println ("Alerts Deleted");

		_state_id_marketAlertUmProperty = 31;//moving to state deletedAlert
		_goto_marketAlertUmProperty(_info);
		}
		else if ((_occurredEvent(_event,60/*logOut*/)) && (isLoggedInOnWebsite ==true )){
		isLoggedInOnWebsite =false ;
_cls_assignment0.pw .println ("Logged Out");

		_state_id_marketAlertUmProperty = 33;//moving to state loggedOut
		_goto_marketAlertUmProperty(_info);
		}
}
else if (_state_id_marketAlertUmProperty==32){
		if (1==0){}
		else if ((_occurredEvent(_event,62/*viewAlerts*/)) && (isLoggedInOnWebsite ==true )){
		eventLogType =7 ;

		_state_id_marketAlertUmProperty = 32;//moving to state viewingAlert
		_goto_marketAlertUmProperty(_info);
		}
		else if ((_occurredEvent(_event,64/*postAlert*/))){
		eventLogType =0 ;
_cls_assignment0.pw .println ("Alert Posted");

		_state_id_marketAlertUmProperty = 30;//moving to state postedAlert
		_goto_marketAlertUmProperty(_info);
		}
		else if ((_occurredEvent(_event,66/*deleteAlerts*/))){
		eventLogType =1 ;
_cls_assignment0.pw .println ("Alerts Deleted");

		_state_id_marketAlertUmProperty = 31;//moving to state deletedAlert
		_goto_marketAlertUmProperty(_info);
		}
		else if ((_occurredEvent(_event,60/*logOut*/)) && (isLoggedInOnWebsite ==true )){
		isLoggedInOnWebsite =false ;
_cls_assignment0.pw .println ("Logged Out");

		_state_id_marketAlertUmProperty = 33;//moving to state loggedOut
		_goto_marketAlertUmProperty(_info);
		}
}
else if (_state_id_marketAlertUmProperty==29){
		if (1==0){}
		else if ((_occurredEvent(_event,62/*viewAlerts*/)) && (isLoggedInOnWebsite ==true )){
		eventLogType =7 ;

		_state_id_marketAlertUmProperty = 32;//moving to state viewingAlert
		_goto_marketAlertUmProperty(_info);
		}
		else if ((_occurredEvent(_event,64/*postAlert*/))){
		eventLogType =0 ;
_cls_assignment0.pw .println ("Alert Posted");

		_state_id_marketAlertUmProperty = 30;//moving to state postedAlert
		_goto_marketAlertUmProperty(_info);
		}
		else if ((_occurredEvent(_event,66/*deleteAlerts*/))){
		eventLogType =1 ;
_cls_assignment0.pw .println ("Alerts Deleted");

		_state_id_marketAlertUmProperty = 31;//moving to state deletedAlert
		_goto_marketAlertUmProperty(_info);
		}
		else if ((_occurredEvent(_event,60/*logOut*/)) && (isLoggedInOnWebsite ==true )){
		isLoggedInOnWebsite =false ;
_cls_assignment0.pw .println ("Logged Out");

		_state_id_marketAlertUmProperty = 33;//moving to state loggedOut
		_goto_marketAlertUmProperty(_info);
		}
}
else if (_state_id_marketAlertUmProperty==33){
		if (1==0){}
		else if ((_occurredEvent(_event,58/*logOn*/)) && (isLoggedInOnWebsite ==false )){
		isLoggedInOnWebsite =true ;
_cls_assignment0.pw .println ("Successful log in");

		_state_id_marketAlertUmProperty = 29;//moving to state loggedIn
		_goto_marketAlertUmProperty(_info);
		}
}
}

public void _goto_marketAlertUmProperty(String _info){
_cls_assignment0.pw.println("[marketAlertUmProperty]MOVED ON METHODCALL: "+ _info +" TO STATE::> " + _string_marketAlertUmProperty(_state_id_marketAlertUmProperty, 1));
_cls_assignment0.pw.flush();
}

public String _string_marketAlertUmProperty(int _state_id, int _mode){
switch(_state_id){
case 30: if (_mode == 0) return "postedAlert"; else return "postedAlert";
case 31: if (_mode == 0) return "deletedAlert"; else return "deletedAlert";
case 32: if (_mode == 0) return "viewingAlert"; else return "viewingAlert";
case 29: if (_mode == 0) return "loggedIn"; else return "loggedIn";
case 33: if (_mode == 0) return "loggedOut"; else return "loggedOut";
default: return "!!!SYSTEM REACHED AN UNKNOWN STATE!!!";
}
}

public boolean _occurredEvent(int[] _events, int event){
for (int i:_events) if (i == event) return true;
return false;
}
}