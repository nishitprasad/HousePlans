/*!
 * FASW Non-jQuery Page Transitions Lightweight v1.2
 * http://fasw.ws/
 *
 * Copyright 2011, Rodrigo Pinto
 * Licensed under the GNU General Public License, version 3 (GPL-3.0)
 * http://www.opensource.org/licenses/GPL-3.0
 * Date: Mon Dec 12 20:00:00 2011 -0400
 * v1.1: 	Modified Firefox compatibility issue. Wed Jan 25 16:30:00 2011 -0400
 * v1.2:	Fixed hyperlink normal functionality when transt attribute is not used
 * 			Fixed Error 0 when running locally
 * 			Fri Feb 3 18:30:00 2011 -0400
 */

function ajaxDivLoad(url, divTarget, onloadajaxdone) {
	  if (window.XMLHttpRequest) {
	    req = new XMLHttpRequest();
	  } else if (window.ActiveXObject) {
	    req = new ActiveXObject("Microsoft.XMLHTTP");
	  }
	  if (req != undefined) {
	    req.onreadystatechange = function() {onDivLoadDone(req, divTarget, onloadajaxdone);};
	    req.open("GET", url, true);
	    req.send("");
	  }
	}  
function onDivLoadDone(req, target, onloadajaxdone) {
	  if (req.readyState == 4) { 
	    if (req.status == 200 || req.status == 0) { 
	      target.innerHTML = req.responseText;
	      onloadajaxdone();
	    } else {
	      target.innerHTML="Error:\n"+ req.status + "\n" +req.statusText;
	    }
	  }
	}
function slideTo(href, effect)
{
	var dochtml = document.body.innerHTML;
	document.body.innerHTML = "";
	var div1 = document.createElement("div");
	div1.id = "div1";
	div1.style.zIndex = 2;
	div1.style.position = "absolute"; 
	div1.style.width = "100%"; 
	div1.style.height = "100%"; 
	div1.style.left = "0px"; 
	div1.style.top = "0px";
    document.body.appendChild(div1);
    div1.innerHTML = dochtml;
	var div2 = document.createElement("div");
	div2.id = "div2";
	div2.style.zIndex = 1;
	div2.style.position = "absolute"; 
	div2.style.width = "100%"; 
	div2.style.height = "100%"; 
	div2.style.left = "0px"; 
	div2.style.top = "0px";
    document.body.appendChild(div2);
	ajaxDivLoad(href, div2, 
			function() {
				window.history.pushState("", "", href);
				setTimeout(function() { div1.className = effect + " out"; }, 1);
				setTimeout(function() { div2.className = effect + " in"; }, 1);
				setTimeout(function() { 
					document.body.innerHTML = div2.innerHTML;
				}, 706);
				
			}
	);
}
function detectClick(event){
	event.preventDefault();
    var tname;
    obj=event.srcElement || event.target;
    var transt = obj.getAttribute("transt");
    if (obj.tagName.toLowerCase()=="a" && transt) 
    {
    	JavaScript:slideTo(obj.getAttribute("href"), transt);
    }
}
function addevent(evnt, elem, func) {
    if (elem.addEventListener)  // W3C DOM
        elem.addEventListener(evnt,func,false);
    else if (elem.attachEvent) { // IE DOM
         var r = elem.attachEvent("on"+evnt, func);
         return r;
    }
}
addevent("click", window, detectClick);
