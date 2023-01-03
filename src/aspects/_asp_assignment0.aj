package aspects;

import larva.*;
public aspect _asp_assignment0 {

public static Object lock = new Object();

boolean initialized = false;

after():(staticinitialization(*)){
if (!initialized){
	initialized = true;
	_cls_assignment0.initialize();
}
}
before () : (call(* *.postAlert(..)) && args(*) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_assignment0.lock){

_cls_assignment0 _cls_inst = _cls_assignment0._get_cls_assignment0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 64/*postAlert*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 64/*postAlert*/);
}
}
before () : (call(* *.viewAlerts(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_assignment0.lock){

_cls_assignment0 _cls_inst = _cls_assignment0._get_cls_assignment0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 62/*viewAlerts*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 62/*viewAlerts*/);
}
}
before () : (call(* *.deleteAlerts(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_assignment0.lock){

_cls_assignment0 _cls_inst = _cls_assignment0._get_cls_assignment0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 66/*deleteAlerts*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 66/*deleteAlerts*/);
}
}
before () : (call(* *.logOn(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_assignment0.lock){

_cls_assignment0 _cls_inst = _cls_assignment0._get_cls_assignment0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 58/*logOn*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 58/*logOn*/);
}
}
before () : (call(* *.logOut(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_assignment0.lock){

_cls_assignment0 _cls_inst = _cls_assignment0._get_cls_assignment0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 60/*logOut*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 60/*logOut*/);
}
}
}