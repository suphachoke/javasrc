if(typeof OpenAjax!=="undefined"&&typeof OpenAjax.hub.registerLibrary!=="undefined"){OpenAjax.hub.registerLibrary("jsf","www.sun.com","2.0",null)}if(!((jsf&&jsf.specversion&&jsf.specversion>=20000)&&(jsf.implversion&&jsf.implversion>=3))){var jsf={};jsf.ajax=function(){var eventListeners=[];var errorListeners=[];var isIE=function isIE(){if(typeof isIECache!=="undefined"){return isIECache}isIECache=document.all&&window.ActiveXObject&&navigator.userAgent.toLowerCase().indexOf("msie")>-1&&navigator.userAgent.toLowerCase().indexOf("opera")==-1;return isIECache};var isIECache;var isAutoExec=function isAutoExec(){try{if(typeof isAutoExecCache!=="undefined"){return isAutoExecCache}var autoExecTestString="<script>var mojarra = mojarra || {};mojarra.autoExecTest = true;<\/script>";var tempElement=document.createElement("span");tempElement.innerHTML=autoExecTestString;var body=document.getElementsByTagName("body")[0];var tempNode=body.appendChild(tempElement);if(mojarra&&mojarra.autoExecTest){isAutoExecCache=true;delete mojarra.autoExecTest}else{isAutoExecCache=false}deleteNode(tempNode);return isAutoExecCache}catch(ex){if(typeof isAutoExecCache==="undefined"){isAutoExecCache=false}return isAutoExecCache}};var isAutoExecCache;var getTransport=function getTransport(){var methods=[function(){return new XMLHttpRequest()},function(){return new ActiveXObject("Msxml2.XMLHTTP")},function(){return new ActiveXObject("Microsoft.XMLHTTP")}];var returnVal;for(var i=0,len=methods.length;i<len;i++){try{returnVal=methods[i]()}catch(e){continue}return returnVal}throw new Error("Could not create an XHR object.")};var $=function $(){var results=[],element;for(var i=0;i<arguments.length;i++){element=arguments[i];if(typeof element=="string"){element=document.getElementById(element)}results.push(element)}return results.length>1?results:results[0]};var getForm=function getForm(element){if(element){var form=$(element);while(form){if(form.nodeName&&(form.nodeName.toLowerCase()=="form")){return form}if(form.form){return form.form}if(form.parentNode){form=form.parentNode}else{form=null}}return document.forms[0]}return null};var isInArray=function isInArray(array,value){for(var i=0;i<array.length;i++){if(array[i]===value){return true}}return false};var globalEval=function globalEval(src){if(window.execScript){window.execScript(src);return}var fn=function(){window.eval.call(window,src)};fn()};var stripScripts=function stripScripts(str){var findscripts=/<script[^>]*>([\S\s]*?)<\/script>/igm;var findscript=/<script([^>]*)>([\S\s]*?)<\/script>/im;var stripStart=/^\s*(<!--)*\s*(\/\/)*\s*(\/\*)*\s*(<!\[CDATA\[)*/;var findsrc=/src="([\S]*?)"/im;var initialnodes=[];var scripts=[];initialnodes=str.match(findscripts);while(!!initialnodes&&initialnodes.length>0){var scriptStr=[];scriptStr=initialnodes.shift().match(findscript);var src=[];src=scriptStr[1].match(findsrc);var script;if(!!src&&src[1]){var url=src[1];if(/\/javax.faces.resource\/jsf.js\?ln=javax\.faces/.test(url)){script=false}else{script=loadScript(url)}}else{if(!!scriptStr&&scriptStr[2]){script=scriptStr[2].replace(stripStart,"")}else{script=false}}if(!!script){scripts.push(script)}}return scripts};var loadScript=function loadScript(url){var xhr=getTransport();if(xhr===null){return""}xhr.open("GET",url,false);xhr.setRequestHeader("Content-Type","application/x-javascript");xhr.send(null);if(xhr.readyState==4&&xhr.status==200){return xhr.responseText}return""};var runScripts=function runScripts(scripts){if(!scripts||scripts.length===0){return}var head=document.getElementsByTagName("head")[0]||document.documentElement;while(scripts.length){var scriptNode=document.createElement("script");scriptNode.type="text/javascript";scriptNode.text=scripts.shift();head.appendChild(scriptNode);head.removeChild(scriptNode)}};var elementReplaceStr=function elementReplaceStr(element,tempTagName,src){var temp=document.createElement(tempTagName);if(element.id){temp.id=element.id}if(element.nodeName.toLowerCase()==="head"){throw new Error("Attempted to replace a head element - this is not allowed.")}else{var scripts=[];if(isAutoExec()){temp.innerHTML=src}else{scripts=stripScripts(src);src=src.replace(/<script[^>]*>([\S\s]*?)<\/script>/igm,"");temp.innerHTML=src}}replaceNode(temp,element);runScripts(scripts)};var getText=function getText(oNode,deep){var Node={ELEMENT_NODE:1,ATTRIBUTE_NODE:2,TEXT_NODE:3,CDATA_SECTION_NODE:4,ENTITY_REFERENCE_NODE:5,ENTITY_NODE:6,PROCESSING_INSTRUCTION_NODE:7,COMMENT_NODE:8,DOCUMENT_NODE:9,DOCUMENT_TYPE_NODE:10,DOCUMENT_FRAGMENT_NODE:11,NOTATION_NODE:12};var s="";var nodes=oNode.childNodes;for(var i=0;i<nodes.length;i++){var node=nodes[i];var nodeType=node.nodeType;if(nodeType==Node.TEXT_NODE||nodeType==Node.CDATA_SECTION_NODE){s+=node.data}else{if(deep===true&&(nodeType==Node.ELEMENT_NODE||nodeType==Node.DOCUMENT_NODE||nodeType==Node.DOCUMENT_FRAGMENT_NODE)){s+=getText(node,true)}}}return s};var PARSED_OK="Document contains no parsing errors";var PARSED_EMPTY="Document is empty";var PARSED_UNKNOWN_ERROR="Not well-formed or other error";var getParseErrorText;if(isIE()){getParseErrorText=function(oDoc){var parseErrorText=PARSED_OK;if(oDoc&&oDoc.parseError&&oDoc.parseError.errorCode&&oDoc.parseError.errorCode!==0){parseErrorText="XML Parsing Error: "+oDoc.parseError.reason+"\nLocation: "+oDoc.parseError.url+"\nLine Number "+oDoc.parseError.line+", Column "+oDoc.parseError.linepos+":\n"+oDoc.parseError.srcText+"\n";for(var i=0;i<oDoc.parseError.linepos;i++){parseErrorText+="-"}parseErrorText+="^\n"}else{if(oDoc.documentElement===null){parseErrorText=PARSED_EMPTY}}return parseErrorText}}else{getParseErrorText=function(oDoc){var parseErrorText=PARSED_OK;if((!oDoc)||(!oDoc.documentElement)){parseErrorText=PARSED_EMPTY}else{if(oDoc.documentElement.tagName=="parsererror"){parseErrorText=oDoc.documentElement.firstChild.data;parseErrorText+="\n"+oDoc.documentElement.firstChild.nextSibling.firstChild.data}else{if(oDoc.getElementsByTagName("parsererror").length>0){var parsererror=oDoc.getElementsByTagName("parsererror")[0];parseErrorText=getText(parsererror,true)+"\n"}else{if(oDoc.parseError&&oDoc.parseError.errorCode!==0){parseErrorText=PARSED_UNKNOWN_ERROR}}}}return parseErrorText}}if((typeof(document.importNode)=="undefined")&&isIE()){try{document.importNode=function(oNode,bChildren){var tmp;if(oNode.nodeName=="#text"){return document.createTextNode(oNode.data)}else{if(oNode.nodeName=="tbody"||oNode.nodeName=="tr"){tmp=document.createElement("table")}else{if(oNode.nodeName=="td"){tmp=document.createElement("tr")}else{if(oNode.nodeName=="option"){tmp=document.createElement("select")}else{tmp=document.createElement("div")}}}if(bChildren){tmp.innerHTML=oNode.xml?oNode.xml:oNode.outerHTML}else{tmp.innerHTML=oNode.xml?oNode.cloneNode(false).xml:oNode.cloneNode(false).outerHTML}return tmp.getElementsByTagName("*")[0]}}}catch(e){}}var Node={ELEMENT_NODE:1,ATTRIBUTE_NODE:2,TEXT_NODE:3,CDATA_SECTION_NODE:4,ENTITY_REFERENCE_NODE:5,ENTITY_NODE:6,PROCESSING_INSTRUCTION_NODE:7,COMMENT_NODE:8,DOCUMENT_NODE:9,DOCUMENT_TYPE_NODE:10,DOCUMENT_FRAGMENT_NODE:11,NOTATION_NODE:12};var clearEvents=function clearEvents(node){if(!node){return}if(node.nodeType==Node.TEXT_NODE||node.nodeType==Node.COMMENT_NODE){return}var events=["abort","blur","change","error","focus","load","reset","resize","scroll","select","submit","unload","keydown","keypress","keyup","click","mousedown","mousemove","mouseout","mouseover","mouseup","dblclick"];try{for(var e in events){if(events.hasOwnProperty(e)){node[e]=null}}}catch(ex){}};var deleteNode=function deleteNode(node){if(!node){return}if(!node.parentNode){return}if(!isIE()){node.parentNode.removeChild(node);return}if(node.nodeName.toLowerCase()==="body"){deleteChildren(node);try{node.outerHTML=""}catch(ex){}return}var temp=node.ownerDocument.createElement("div");var parent=node.parentNode;temp.appendChild(parent.removeChild(node));try{temp.outerHTML=""}catch(ex){}};var deleteChildren=function deleteChildren(node){if(!node){return}for(var x=node.childNodes.length-1;x>=0;x--){var childNode=node.childNodes[x];deleteNode(childNode)}};var copyChildNodes=function copyChildNodes(nodeFrom,nodeTo){if((!nodeFrom)||(!nodeTo)){throw"Both source and destination nodes must be provided"}deleteChildren(nodeTo);var nodes=nodeFrom.childNodes;if(nodeFrom.ownerDocument==nodeTo.ownerDocument){while(nodeFrom.firstChild){nodeTo.appendChild(nodeFrom.firstChild)}}else{var ownerDoc=nodeTo.nodeType==Node.DOCUMENT_NODE?nodeTo:nodeTo.ownerDocument;var i;if(typeof(ownerDoc.importNode)!="undefined"){for(i=0;i<nodes.length;i++){nodeTo.appendChild(ownerDoc.importNode(nodes[i],true))}}else{for(i=0;i<nodes.length;i++){nodeTo.appendChild(nodes[i].cloneNode(true))}}}};var replaceNode=function replaceNode(newNode,node){if(isIE()){node.parentNode.insertBefore(newNode,node);deleteNode(node)}else{node.parentNode.replaceChild(newNode,node)}};var cloneAttributes=function cloneAttributes(target,source){var coreElementAttributes=["className","title","lang","xml:lang"];var inputElementAttributes=["name","value","checked","disabled","readOnly","size","maxLength","src","alt","useMap","isMap","tabIndex","accessKey","accept","type"];var listenerNames=["onclick","ondblclick","onmousedown","onmousemove","onmouseout","onmouseover","onmouseup","onkeydown","onkeypress","onkeyup","onhelp","onblur","onfocus","onchange","onload","onunload","onabort","onreset","onselect","onsubmit"];var iIndex,iLength;var attributeName;var newValue,oldValue;for(iIndex=0,iLength=coreElementAttributes.length;iIndex<iLength;iIndex++){attributeName=coreElementAttributes[iIndex];newValue=source[attributeName];oldValue=target[attributeName];if(oldValue!=newValue){target[attributeName]=newValue}}if(target.nodeName.toLowerCase()==="input"){for(iIndex=0,iLength=inputElementAttributes.length;iIndex<iLength;iIndex++){attributeName=inputElementAttributes[iIndex];newValue=source[attributeName];oldValue=target[attributeName];if(oldValue!=newValue){target[attributeName]=newValue}}}var newStyle=source.getAttribute("style");var oldStyle=target.getAttribute("style");if(newStyle!=oldStyle){if(isIE()){target.style.setAttribute("cssText",newStyle,0)}else{target.setAttribute("style",newStyle)}}for(var lIndex=0,lLength=listenerNames.length;lIndex<lLength;lIndex++){var name=listenerNames[lIndex];target[name]=source[name]?source[name]:null;if(source[name]){source[name]=null}}if(!isIE()&&source.dir!=target.dir){target.dir=source.dir?source.dir:null}};var elementReplace=function elementReplace(newElement,origElement){copyChildNodes(newElement,origElement);origElement.innerHTML=origElement.innerHTML;try{cloneAttributes(origElement,newElement)}catch(ex){if(jsf.getProjectStage()=="Development"){throw new Error("Error updating attributes")}}deleteNode(newElement)};var getBodyElement=function getBodyElement(docStr){var doc;var body;if(typeof DOMParser!=="undefined"){doc=(new DOMParser()).parseFromString(docStr,"text/xml")}else{if(typeof ActiveXObject!=="undefined"){doc=new ActiveXObject("MSXML2.DOMDocument");doc.loadXML(docStr)}else{throw new Error("You don't seem to be running a supported browser")}}if(getParseErrorText(doc)!==PARSED_OK){throw new Error(getParseErrorText(doc))}body=doc.getElementsByTagName("body")[0];if(!body){throw new Error("Can't find body tag in returned document.")}return body};var doUpdate=function doUpdate(element,context){var id,content,markup,state;var stateForm;var scripts=[];id=element.getAttribute("id");if(id==="javax.faces.ViewState"){state=element.firstChild;stateForm=document.getElementById(context.formid);if(!stateForm||!stateForm.elements){return}var field=stateForm.elements["javax.faces.ViewState"];if(typeof field=="undefined"){field=document.createElement("input");field.type="hidden";field.name="javax.faces.ViewState";stateForm.appendChild(field)}field.value=state.nodeValue;if(typeof context.render!=="undefined"&&context.render!==null){var temp=context.render.split(" ");for(var i=0;i<temp.length;i++){if(temp.hasOwnProperty(i)){var f=document.forms[temp[i]];if(typeof f!=="undefined"&&f!==null&&f.id!==context.formid){field=f.elements["javax.faces.ViewState"];if(typeof field==="undefined"){field=document.createElement("input");field.type="hidden";field.name="javax.faces.ViewState";f.appendChild(field)}field.value=state.nodeValue}}}}return}markup="";for(var j=0;j<element.childNodes.length;j++){content=element.childNodes[j];markup+=content.nodeValue}var src=markup;if(id==="javax.faces.ViewRoot"||id==="javax.faces.ViewBody"){var bodyStartEx=new RegExp("< *body[^>]*>","gi");var bodyEndEx=new RegExp("< */ *body[^>]*>","gi");var newsrc;var docBody=document.getElementsByTagName("body")[0];var bodyStart=bodyStartEx.exec(src);if(bodyStart!==null){try{scripts=stripScripts(src);newsrc=src.replace(/<script[^>]*>([\S\s]*?)<\/script>/igm,"");elementReplace(getBodyElement(newsrc),docBody);runScripts(scripts)}catch(e){var srcBody,bodyEnd;bodyEnd=bodyEndEx.exec(src);if(bodyEnd!==null){srcBody=src.substring(bodyStartEx.lastIndex,bodyEnd.index)}else{srcBody=src.substring(bodyStartEx.lastIndex)}elementReplaceStr(docBody,"body",srcBody)}}else{elementReplaceStr(docBody,"body",src)}}else{if(id==="javax.faces.ViewHead"){throw new Error("javax.faces.ViewHead not supported - browsers cannot reliably replace the head's contents")}else{var d=$(id);if(!d){throw new Error("During update: "+id+" not found")}var parent=d.parentNode;var html=src.replace(/^\s+/g,"").replace(/\s+$/g,"");var parserElement=document.createElement("div");var tag=d.nodeName.toLowerCase();var tableElements=["td","th","tr","tbody","thead","tfoot"];var isInTable=false;for(var tei=0,tel=tableElements.length;tei<tel;tei++){if(tableElements[tei]==tag){isInTable=true;break}}if(isInTable){if(isAutoExec()){parserElement.innerHTML="<table>"+html+"</table>"}else{scripts=stripScripts(html);html=html.replace(/<script[^>]*>([\S\s]*?)<\/script>/igm,"");parserElement.innerHTML="<table>"+html+"</table>"}var newElement=parserElement.firstChild;while((null!==newElement)&&(id!==newElement.id)){newElement=newElement.firstChild}parent.replaceChild(newElement,d);runScripts(scripts)}else{if(d.nodeName.toLowerCase()==="input"){parserElement=document.createElement("div");parserElement.innerHTML=html;newElement=parserElement.firstChild;cloneAttributes(d,newElement);deleteNode(parserElement)}else{if(html.length>0){if(isAutoExec()){parserElement.innerHTML=html}else{scripts=stripScripts(html);html=html.replace(/<script[^>]*>([\S\s]*?)<\/script>/igm,"");parserElement.innerHTML=html}replaceNode(parserElement.firstChild,d);deleteNode(parserElement);runScripts(scripts)}}}}}};var doDelete=function doDelete(element){var id=element.getAttribute("id");var target=$(id);deleteNode(target)};var doInsert=function doInsert(element){var scripts=[];var target=$(element.firstChild.getAttribute("id"));var parent=target.parentNode;var tempElement=document.createElement("span");var html=element.firstChild.firstChild.nodeValue;if(isAutoExec()){tempElement.innerHTML=html}else{scripts=stripScripts(html);html=html.replace(/<script[^>]*>([\S\s]*?)<\/script>/igm,"");tempElement.innerHTML=html}if(element.firstChild.nodeName==="after"){target=target.nextSibling}if(!!tempElement.innerHTML){parent.insertBefore(tempElement.firstChild,target)}runScripts(scripts);deleteNode(tempElement)};var doAttributes=function doAttributes(element){var id=element.getAttribute("id");var target=$(id);if(!target){throw new Error("The specified id: "+id+" was not found in the page.")}var nodes=element.childNodes;for(var i=0;i<nodes.length;i++){var name=nodes[i].getAttribute("name");var value=nodes[i].getAttribute("value");if(!isIE()){target.setAttribute(name,value)}else{if(name==="class"){name="className";target.setAttribute(name,value,0)}else{if(name==="for"){name="htmlFor";target.setAttribute(name,value,0)}else{if(name==="style"){target.style.setAttribute("cssText",value,0)}else{if(name.substring(0,2)==="on"){var fn=function(value){return function(){window.execScript(value)}}(value);target.setAttribute(name,fn,0)}else{if(name==="dir"){if(jsf.getProjectStage()=="Development"){throw new Error("Cannot set 'dir' attribute in IE")}}else{target.setAttribute(name,value,0)}}}}}}}};var doEval=function doEval(element){var evalText=element.firstChild.nodeValue;globalEval(evalText)};var Queue=new function Queue(){var queue=[];var queueSpace=0;this.getSize=function getSize(){return queue.length-queueSpace};this.isEmpty=function isEmpty(){return(queue.length===0)};this.enqueue=function enqueue(element){queue.push(element)};this.dequeue=function dequeue(){var element=undefined;if(queue.length){element=queue[queueSpace];if(++queueSpace*2>=queue.length){queue=queue.slice(queueSpace);queueSpace=0}}try{return element}finally{element=null}};this.getOldestElement=function getOldestElement(){var element=undefined;if(queue.length){element=queue[queueSpace]}try{return element}finally{element=null}}}();var AjaxEngine=function AjaxEngine(){var req={};req.url=null;req.context={};req.context.sourceid=null;req.context.onerror=null;req.context.onevent=null;req.context.formid=null;req.xmlReq=null;req.async=true;req.parameters={};req.queryString=null;req.method=null;req.status=null;req.fromQueue=false;req.que=Queue;req.xmlReq=getTransport();if(req.xmlReq===null){return null}function noop(){}req.xmlReq.onreadystatechange=function(){if(req.xmlReq.readyState===4){req.onComplete();req.xmlReq.onreadystatechange=noop;req.xmlReq=null}};req.onComplete=function onComplete(){if(req.xmlReq.status&&(req.xmlReq.status>=200&&req.xmlReq.status<300)){sendEvent(req.xmlReq,req.context,"complete");jsf.ajax.response(req.xmlReq,req.context)}else{sendEvent(req.xmlReq,req.context,"complete");sendError(req.xmlReq,req.context,"httpError")}var nextReq=req.que.getOldestElement();if(nextReq===null||typeof nextReq==="undefined"){return}while((typeof nextReq.xmlReq!=="undefined"&&nextReq.xmlReq!==null)&&nextReq.xmlReq.readyState===4){req.que.dequeue();nextReq=req.que.getOldestElement();if(nextReq===null||typeof nextReq==="undefined"){break}}if(nextReq===null||typeof nextReq==="undefined"){return}if((typeof nextReq.xmlReq!=="undefined"&&nextReq.xmlReq!==null)&&nextReq.xmlReq.readyState===0){nextReq.fromQueue=true;nextReq.sendRequest()}};req.setupArguments=function(args){for(var i in args){if(args.hasOwnProperty(i)){if(typeof req[i]==="undefined"){req.parameters[i]=args[i]}else{req[i]=args[i]}}}};req.sendRequest=function(){if(req.xmlReq!==null){if(!req.que.isEmpty()){if(!req.fromQueue){req.que.enqueue(req);return}}if(!req.fromQueue){req.que.enqueue(req)}if(req.generateUniqueUrl&&req.method=="GET"){req.parameters.AjaxRequestUniqueId=new Date().getTime()+""+req.requestIndex}var content=null;for(var i in req.parameters){if(req.parameters.hasOwnProperty(i)){if(req.queryString.length>0){req.queryString+="&"}req.queryString+=encodeURIComponent(i)+"="+encodeURIComponent(req.parameters[i])}}if(req.method==="GET"){if(req.queryString.length>0){req.url+=((req.url.indexOf("?")>-1)?"&":"?")+req.queryString}}req.xmlReq.open(req.method,req.url,req.async);if(req.method==="POST"){if(typeof req.xmlReq.setRequestHeader!=="undefined"){req.xmlReq.setRequestHeader("Faces-Request","partial/ajax");req.xmlReq.setRequestHeader("Content-type","application/x-www-form-urlencoded")}content=req.queryString}if(!req.async){req.xmlReq.onreadystatechange=null}sendEvent(req.xmlReq,req.context,"begin");req.xmlReq.send(content);if(!req.async){req.onComplete()}}};return req};var sendError=function sendError(request,context,status,description,serverErrorName,serverErrorMessage){var sent=false;var data={};data.type="error";data.status=status;data.source=context.sourceid;data.responseCode=request.status;data.responseXML=request.responseXML;data.responseText=request.responseText;if(typeof data.source==="string"){data.source=document.getElementById(data.source)}if(description){data.description=description}else{if(status=="httpError"){if(data.responseCode===0){data.description="The Http Transport returned a 0 status code.  This is usually the result of mixing ajax and full requests.  This is usually undesired, for both performance and data integrity reasons."}else{data.description="There was an error communicating with the server, status: "+data.responseCode}}else{if(status=="serverError"){data.description=serverErrorMessage}else{if(status=="emptyResponse"){data.description="An empty response was received from the server.  Check server error logs."}else{if(status=="malformedXML"){if(getParseErrorText(data.responseXML)!==PARSED_OK){data.description=getParseErrorText(data.responseXML)}else{data.description="An invalid XML response was received from the server."}}}}}}if(status=="serverError"){data.errorName=serverErrorName;data.errorMessage=serverErrorMessage}if(context.onerror){context.onerror.call(null,data);sent=true}for(var i in errorListeners){if(errorListeners.hasOwnProperty(i)){errorListeners[i].call(null,data);sent=true}}if(!sent&&jsf.getProjectStage()==="Development"){if(status=="serverError"){alert("serverError: "+serverErrorName+" "+serverErrorMessage)}else{alert(status+": "+data.description)}}};var sendEvent=function sendEvent(request,context,status){var data={};data.type="event";data.status=status;data.source=context.sourceid;if(typeof data.source==="string"){data.source=document.getElementById(data.source)}if(status!=="begin"){data.responseCode=request.status;data.responseXML=request.responseXML;data.responseText=request.responseText}if(context.onevent){context.onevent.call(null,data)}for(var i in eventListeners){if(eventListeners.hasOwnProperty(i)){eventListeners[i].call(null,data)}}};return{addOnError:function addOnError(callback){if(typeof callback==="function"){errorListeners[errorListeners.length]=callback}else{throw new Error("jsf.ajax.addOnError:  Added a callback that was not a function.")}},addOnEvent:function addOnEvent(callback){if(typeof callback==="function"){eventListeners[eventListeners.length]=callback}else{throw new Error("jsf.ajax.addOnEvent: Added a callback that was not a function")}},request:function request(source,event,options){var element,form;var all,none;if(typeof source==="undefined"||source===null){throw new Error("jsf.ajax.request: source not set")}if(typeof source==="string"){element=document.getElementById(source)}else{if(typeof source==="object"){element=source}else{throw new Error("jsf.request: source must be object or string")}}if(!element.name){element.name=element.id}if(typeof(options)==="undefined"||options===null){options={}}var onerror=false;if(options.onerror&&typeof options.onerror==="function"){onerror=options.onerror}else{if(options.onerror&&typeof options.onerror!=="function"){throw new Error("jsf.ajax.request: Added an onerror callback that was not a function")}}var onevent=false;if(options.onevent&&typeof options.onevent==="function"){onevent=options.onevent}else{if(options.onevent&&typeof options.onevent!=="function"){throw new Error("jsf.ajax.request: Added an onevent callback that was not a function")}}form=getForm(element);if(!form){throw new Error("jsf.ajax.request: Method must be called within a form")}var viewState=jsf.getViewState(form);var args={};args["javax.faces.source"]=element.id;if(event&&!!event.type){args["javax.faces.partial.event"]=event.type}if(options.execute){none=options.execute.search(/@none/);if(none<0){all=options.execute.search(/@all/);if(all<0){options.execute=options.execute.replace("@this",element.id);options.execute=options.execute.replace("@form",form.id);var temp=options.execute.split(" ");if(!isInArray(temp,element.name)){options.execute=element.name+" "+options.execute}}else{options.execute="@all"}args["javax.faces.partial.execute"]=options.execute}}else{options.execute=element.name+" "+element.id;args["javax.faces.partial.execute"]=options.execute}if(options.render){none=options.render.search(/@none/);if(none<0){all=options.render.search(/@all/);if(all<0){options.render=options.render.replace("@this",element.id);options.render=options.render.replace("@form",form.id)}else{options.render="@all"}args["javax.faces.partial.render"]=options.render}}delete options.execute;delete options.render;delete options.onerror;delete options.onevent;for(var property in options){if(options.hasOwnProperty(property)){args[property]=options[property]}}args["javax.faces.partial.ajax"]="true";args.method="POST";var encodedUrlField=form.elements["javax.faces.encodedURL"];if(typeof encodedUrlField=="undefined"){args.url=form.action}else{args.url=encodedUrlField.value}var ajaxEngine=new AjaxEngine();ajaxEngine.setupArguments(args);ajaxEngine.queryString=viewState;ajaxEngine.context.onevent=onevent;ajaxEngine.context.onerror=onerror;ajaxEngine.context.sourceid=element.id;ajaxEngine.context.formid=form.id;ajaxEngine.context.render=args["javax.faces.partial.render"];ajaxEngine.sendRequest();element=null;form=null},response:function response(request,context){if(!request){throw new Error("jsf.ajax.response: Request parameter is unset")}if(typeof context.sourceid==="string"){context.sourceid=document.getElementById(context.sourceid)}var xml=request.responseXML;if(xml===null){sendError(request,context,"emptyResponse");return}if(getParseErrorText(xml)!==PARSED_OK){sendError(request,context,"malformedXML");return}var responseType=xml.getElementsByTagName("partial-response")[0].firstChild;if(responseType.nodeName==="error"){var errorName=responseType.firstChild.firstChild.nodeValue;var errorMessage=responseType.firstChild.nextSibling.firstChild.nodeValue;sendError(request,context,"serverError",null,errorName,errorMessage);sendEvent(request,context,"success");return}if(responseType.nodeName==="redirect"){window.location=responseType.getAttribute("url");return}if(responseType.nodeName!=="changes"){sendError(request,context,"malformedXML","Top level node must be one of: changes, redirect, error, received: "+responseType.nodeName+" instead.");return}var changes=responseType.childNodes;try{for(var i=0;i<changes.length;i++){switch(changes[i].nodeName){case"update":doUpdate(changes[i],context);break;case"delete":doDelete(changes[i]);break;case"insert":doInsert(changes[i]);break;case"attributes":doAttributes(changes[i]);break;case"eval":doEval(changes[i]);break;case"extension":break;default:sendError(request,context,"malformedXML","Changes allowed are: update, delete, insert, attributes, eval, extension.  Received "+changes[i].nodeName+" instead.");return}}}catch(ex){sendError(request,context,"malformedXML",ex.message);return}sendEvent(request,context,"success")}}}();jsf.getProjectStage=function(){if(typeof mojarra!=="undefined"&&typeof mojarra.projectStageCache!=="undefined"){return mojarra.projectStageCache}var a=document.getElementsByTagName("script");var b;var e=0;var d;var c;while(e<a.length){if(typeof a[e].src==="string"&&a[e].src.match("/javax.faces.resource/jsf.js?.*ln=javax.faces")){b=a[e].src;break}e++}if(typeof b=="string"){c=b.match("stage=(.*)");if(c){d=c[1]}}if(typeof d==="undefined"||!d){d="Production"}mojarra=mojarra||{};mojarra.projectStageCache=d;return mojarra.projectStageCache};jsf.getViewState=function(g){if(!g){throw new Error("jsf.getViewState:  form must be set")}var e=g.elements;var a=e.length;var b=[];var h=function(j,k){var i="";if(b.length>0){i="&"}i+=encodeURIComponent(j)+"="+encodeURIComponent(k);b.push(i)};for(var d=0;d<a;d++){var f=e[d];if(!f.disabled){switch(f.type){case"text":case"password":case"hidden":case"textarea":h(f.name,f.value);break;case"select-one":if(f.selectedIndex>=0){h(f.name,f.options[f.selectedIndex].value)}break;case"select-multiple":for(var c=0;c<f.options.length;c++){if(f.options[c].selected){h(f.name,f.options[c].value)}}break;case"checkbox":case"radio":if(f.checked){h(f.name,f.value||"on")}break}}}return b.join("")};jsf.util={};jsf.util.chain=function(g,d){if(arguments.length<3){return true}var a=(typeof g==="object")?g:null;for(var b=2;b<arguments.length;b++){var e=new Function("event",arguments[b]);var c=e.call(a,d);if(c===false){return false}}return true};jsf.specversion=20000;jsf.implversion=3}if(typeof OpenAjax!=="undefined"&&typeof OpenAjax.hub.registerLibrary!=="undefined"){OpenAjax.hub.registerLibrary("mojarra","www.sun.com","1.0",null)}var mojarra=mojarra||{};mojarra.dpf=function dpf(c){var b=c.adp;if(b!==null){for(var a=0;a<b.length;a++){c.removeChild(b[a])}}};mojarra.apf=function apf(e,c){var d=new Array();e.adp=d;var b=0;for(var a in c){if(c.hasOwnProperty(a)){var g=document.createElement("input");g.type="hidden";g.name=a;g.value=c[a];e.appendChild(g);d[b++]=g}}};mojarra.jsfcljs=function jsfcljs(c,b,a){mojarra.apf(c,b);var d=c.target;if(a){c.target=a}c.submit();c.target=d;mojarra.dpf(c)};mojarra.jsfcbk=function jsfcbk(b,a,c){return b.call(a,c)};mojarra.ab=function ab(c,d,g,a,b,f){if(!f){f={}}if(g){f["javax.faces.behavior.event"]=g}if(a){f.execute=a}if(b){f.render=b}jsf.ajax.request(c,d,f)};