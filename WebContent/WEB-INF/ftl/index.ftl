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
    "left" /></a> FreeMarker Struts2 Hello World</h2>
  </div>

  <div id="content">
    <fieldset>
      <legend>Add User</legend>

	<@s.form action="add" method="post">
	    <@s.textfield label="First name" name="user.firstname"/>
	    <@s.textfield label="Last name" name="user.lastname"/>
	    <#list userList as answerList>
                                    <span class="listFloatLeft">
                                        <input id="answerList${answerList_index}" type="checkbox" class="require-one surveyAnswer"
                                            value="${answerList.lastname}" name="answerList${answerList_index}"
                                        > <label for="answerList${answerList_index}">${answerList.lastname}</label>
                                    </span>
                                </#list>
	    <@s.submit value="Save"/>
	</@s.form>

    </fieldset><br />

    <table class="datatable">
      <tr>
        <th>Firstname</th>
        <th>Lastname</th>
      </tr>
	<#list userList as user>
  	<tr>
  		<td>${user.firstname}</td> <td>${user.lastname}</td>
  	</tr>
    </#list>	  
    </table>
  </div>
</body>
</html>