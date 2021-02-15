<html>
<head>
  <meta name="generator" content=
  "HTML Tidy for Linux/x86 (vers 11 February 2007), see www.w3.org" />

  <title>ViralPatel.net - FreeMarker Spring MVC Hello World</title>
</head>

<body>
  <div id="header">
    <h2><a href="//www.viralpatel.net"><img height="37" width="236" border="0px" src=
    "https://www.viralpatel.net/wp-content/themes/vp/images/logo.png" align=
    "left" /></a> FreeMarker Struts2 Application</h2>
  </div>

  <div id="content">
    <fieldset>
      <legend>Select Accommodations:</legend>

	<@s.form action="add" method="post">
	    <#assign acclist = ['ZoomText', 'Modifiable screen']>
	    <#list acclist as answerList>
                                    <span class="listFloatLeft">
                                        <input id="answerList${answerList_index}" type="checkbox" class="require-one surveyAnswer"
                                            value=${answerList} name="user.firstname" list="userList">
                                             <label for="answerList${answerList_index}">${answerList}</label>
                                    </span>
                                </#list>
	    <@s.submit value="Save"/>
	</@s.form>

    </fieldset><br />

    <table class="datatable">
	<#list userList as user>
	  	<tr>
	  		<td>${user.firstname}</td>
	  	</tr>
    </#list>	  
    </table>
  </div>
</body>
</html>