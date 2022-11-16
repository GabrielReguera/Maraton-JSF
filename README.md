 ---Tags---
h: -- é para usar tags do HTML
ui: -- tags ligado a parte de templates
f: -- Funções de ajax, drop down
c: -- Funções de Core

---@'s---

@Named -- ja deixa a classe instanciada. não precisa dar "new". perimite acessar diretamente o Bean.
@ViewScoped -- Ele não deixa os atributos na página renderizarem de novo, ele mantem do mesmo jeito. ( clico em algum botão, e ele só atualiza aquilo e nada mais)--(certo é javax.faces.view)

Injects -- AplicationScoped, SessionScoped, RequestScoped, Dependent.
------------------------------------------------------
@RequestScoped -- Ele deixa a requisição viva até ela terminar, depois ela morre. ( cria uma string e envia um método, depois ele morre, quando fizer a requisição de novo, ele cria uma string envia o método e morre). (Utilizado para quando precisar só exibir alguma mensagem para o Usuário)

Injects -- AplicationScoped, SessionScoped, Dependent.
------------------------------------------------------
@SessionScoped -- A seção fica viva enquanto não tiver um comando para parar, fechar o browser, etc. ( Você abre outra guia, e continua com os mesmos atributos nessa pagina, ou logado, etc)

Inject -- AplicationScoped, SessionScoped, Dependent.
------------------------------------------------------
@AplicationScoped -- Deixa a sessão viva duranto todo o ciclo de vida do Servidor.( Permite ver as ações em qualquer página)

Injects -- AplicationScoped, Dependent.
------------------------------------------------------
@PostConstruct -- Ja carrega antes de entrar na página. Com o "@SessionScoped" só carrega uma vez.
@ConversationScoped -- Mantem o estado do Bean.
@FlowScoped -- Mantem os dados navegando num mesmo Conjunto de páginas, ( entro em varias paginas de produto, mas todos os produtos vão para o mesmo carrinho, ou quando for preencher um formulário e precisar voltar uma página para alterar algo, os dados vão estar lá)
@Dependent -- Escopo padrão, quando nenhum outro utilizado. Ele pega a função do escopo quando injetado em outra classe. (injetado em um ViewScoped, ele vai pegar as funções do View)

--Expression Language--

#{} -- escrever e ler valores, pegando eles das classes. ( <h:outputLabel value= "#{estudante.nome}"/> )
----------
ui:repeat -- Igual a um " Foreach ", pode ser usado com Listas tambem. ( <ui:repeat value="#{estudantes.nomesArray}" var="nome"> 
	<h:outputLabel value="#{nome}"/>
</ui:repeat> )
varStatus="" -- é uma variavel auxiliar do "ui:repeat", onde pode imprimir algumas coisas nele.

----------
f:ajax -- Ele executa só o médoto/função pedido, sem recarregar a página inteira.
listener -- função de action do ajax.

----------

<c:set -- Faz uma variável, ( <c:set var="numeros" value="#{[1,2,3,4,5,6]}"/> )

rendered="" -- Uma tag que só irá renderizar se.... Pode ser Bolleano, String, Int, etc.

.stream().filter() -- faz um filtro. ( <ui:repeat value="#{[1,2,3,4,5,6,7,8].stream().filter(v-> v > 5).toList()}" ).

<f:event -- uma função para alguns tipos de enventos, Exemplo é chamar um método antes de carregar a página.
<f:viewParam -- para carregar a página vc define um parametro nessa função. 
( <f:metaData>
	<f:viewParam name="nome" value="#{comuni.nome}"/>
	<f:event type"preRenderView" listener="#{comuniTeste.init}"/>
 </f:metaData> )

f:convertDateTime -- Converte o formato da Data. ( <f:coonvertDateTime pattern="dd-MM-yyyy"/> )

of:formatDate -- Função do ominifaces para alterar o formato da data. 
( value="#{of:formatDate(comuniTeste.data,'dd-MM-yyyy')}"/> )

f:attribute -- Adiciona atributo a um componente, podendo busca-lo dentro do Bean(classe).
( <h:commandButton value="add attribute" actionListerner="#{comuniTeste.execute}">
	<f:attribute name="estudante" value="Gabriel"/> 
</h:commandButton> 

<o:form includeRequestParams="true"> -- Ele permanece os parametros na URL.

<f:viewAction -- É igual o "<f:event/>" só que melhor, (ele renderiza antes da página).

//na classe//
String nome = (String) event.getComponent().getAttributes().get("estudante"); )


---Comparações---
- "eq" ou "==" -- Se é igual. ( #{estudante.nota1 eq estudante.nota2} ). Retorna Booleano.
- .equals() -- Se a String é igual. ( #{estudante.nome.equals('Gabriel')} ) 
- and -- Junção " e ". ( #{a.nome.equals('a')  and  b.nome.equals('b')} )
- or -- Junção " ou ".
- ne -- Junção " != ", Direferente de...
- lt -- É a comparação de menor, igual a "<". ( #{estudante.nota1  lt  estudante.nota2} )
- le -- É a comparação de menor ou igual. igual a "<=". ( #{estudante.nota1  le  estudante.nota2} )
- gt -- É a comparação de maior, igual a " > ".
- ge -- É a comparação de maior ou igual, igual a " >= ".
- ? -- Igual a um If. ( #{estudante.nota1 eq  ?  0 'Zero' : 'Não zero'} )
- = -- Éssa atribuição só altera o valor na linha e não na classe.
- += -- Contatenação, só concatena o valor na linha e não na classe.
- div -- Para Divisão, igual a " / "
- mod -- Para o Resto, igual a " % "
---------------

---Escopos---

-------------

---XML---
Definir tempo de seção( 
<session-config>
	<session-timeout>30"minutos"</session-timeout>
</session-config>
---------

Ivalidar a sessão -- FacesContext.getCurrentInstance().getExternalContext().invalidateSession();

.getFlash() -- Faz uma requisição sobreviver por só um redirecionamento. 

actionListener -- Faz uma ação e retorna Void.

immediate=true -- Quando colocado no Button, ele ignora qualquer validação e executa. Quando colocado em um "input" por exemplo, ele verifica primeiro que um "input" sem o "immediate".
