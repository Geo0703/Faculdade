**Garantia de Qualidade de Software (SQA): Conceitos, Técnicas e Aplicações**  
*(Pesquisa Completa)*  

---

### **1. Introdução à Garantia de Qualidade de Software (SQA)**  
A **Garantia de Qualidade de Software (SQA)** é um conjunto sistemático de atividades para assegurar que o software atenda a padrões técnicos e expectativas do usuário. Segundo **Pressman (2016, p. 381)**, seu objetivo é "prevenir defeitos, não apenas corrigi-los". Surgiu na década de 1970, após falhas críticas como o bug do Mariner 1, que custou US$ 80 milhões à NASA (**Sommerville, 2015, p. 655**). A SQA engloba processos, métricas e ferramentas para monitorar qualidade desde a concepção até a entrega, sendo crucial em sistemas críticos (saúde, aviação), onde falhas podem ser catastróficas.  

---

### **2. Componentes da SQA**  
#### **2.1 Processos e Padrões**  
- **Modelos de Maturidade**:  
  - **CMMI (Capability Maturity Model Integration)**: Avalia processos em níveis (de caótico a otimizado) (**Sommerville, 2015, p. 662**).  
  - **ISO 9001**: Foco na gestão de qualidade contínua (**Artigo: Pereira et al., 2018**).  

#### **2.2 Métricas de Qualidade**  
- **Pressman (2016, p. 389)** classifica métricas em:  
  - **Processo**: Tempo de ciclo, taxa de defeitos (ex: 2 defeitos/1000 linhas).  
  - **Produto**: Complexidade ciclomática, cobertura de testes.  
- **Exemplo Prático**: Corrigir um defeito pós-lançamento custa 100x mais do que durante o design (**Boehm, 1984**).  

#### **2.3 Ferramentas e Automação**  
- **Testes**: Selenium (web), JUnit (unitários).  
- **Análise Estática**: SonarQube para identificar *code smells*.  
- **Integração Contínua (CI)**: Jenkins e GitHub Actions (**Sommerville, 2015, p. 670**).  

#### **2.4 Cultura Organizacional**  
- Envolvimento de toda a equipe (desenvolvedores, testadores, gestores).  
- Empresas com cultura de qualidade têm 40% menos defeitos pós-lançamento (**Runeson et al., 2012**).  

---

### **3. Técnicas de SQA**  
#### **3.1 Revisões Formais**  
- **Inspeção de Fagan**: Processo estruturado com papéis definidos (revisor, moderador), identifica até 75% dos erros precocemente (**Pressman, 2016, p. 388**).  
- **Walkthroughs**: Discussões informais para validar requisitos (**Sommerville, 2015, p. 657**).  

#### **3.2 Testes Especializados**  
- **Teste de Segurança**: Identificação de vulnerabilidades (OWASP Top 10).  
- **Teste de Usabilidade**: Heurísticas de Nielsen (**Nielsen, 1994**).  
- **Teste Baseado em Modelos (MBT)**: Geração de casos a partir de diagramas UML (**Ammann & Offutt, 2016**).  

#### **3.3 Gestão de Configuração**  
- Controle de versões (Git) para rastrear mudanças e evitar regressões (**Pressman, 2016, p. 460**).  

---

### **4. SQA em Metodologias de Desenvolvimento**  
#### **4.1 Modelo Cascata**  
- SQA aplicada em fases sequenciais, com revisões formais antes de cada etapa (**Sommerville, 2015, p. 52**).  

#### **4.2 Metodologias Ágeis**  
- **Scrum**:  
  - **Definition of Done (DoD)**: Critérios claros para aceitação (**Pressman, 2016, p. 402**).  
  - **TDD (Test-Driven Development)**: Testes escritos antes do código (**Beck, 2003**).  

#### **4.3 DevOps**  
- Pipelines CI/CD automatizados (ex: GitHub Actions) com testes contínuos (**Netflix Tech Blog, 2020**).  

---

### **5. Desafios na Implementação da SQA**  
- **Custos Iniciais**: Ferramentas e treinamento exigem investimento (**Pressman, 2016, p. 395**).  
- **Resistência Cultural**: Equipes rejeitam processos burocráticos (**Šmite et al., 2019**).  
- **Complexidade em Projetos Grandes**: Coordenação em equipes globais (**Sommerville, 2015, p. 672**).  

---

### **6. Estudos de Caso Reais**  
#### **6.1 NASA (Mars Rover)**  
- Revisões diárias de código e simulações de falhas garantiram 0 defeitos críticos (**Sommerville, 2015, p. 664**).  

#### **6.2 Spotify**  
- Squads autônomos com testes automatizados reduziram tempo de entrega em 30% (**Spotify Labs, 2017**).  

---

### **7. Tendências Futuras em SQA**  
- **IA na Qualidade**: Machine Learning prevê defeitos (ex: Google Tricorder) (**McConnell, 2021**).  
- **Shift-Left Testing**: Testes iniciados na fase de requisitos (**Pressman, 2016, p. 392**).  

---

### **8. Conclusão**  
A SQA é essencial para entregar software confiável e sustentável. Equilibra processos, automação e cultura, adaptando-se a metodologias como Ágil e DevOps. Desafios como custos e resistência exigem abordagens estratégicas, enquanto tendências como IA prometem revolucionar a área.  

---

### **Referências Bibliográficas (ABNT)**  
1. **PRESSMAN, R. S.** *Engenharia de Software: Uma Abordagem Profissional*. 8. ed. AMGH, 2016.  
2. **SOMMERVILLE, I.** *Engenharia de Software*. 10. ed. Pearson, 2015.  
3. **AMMANN, P.; OFFUTT, J.** *Introduction to Software Testing*. 2. ed. Cambridge, 2016.  
4. **NIELSEN, J.** *Usability Engineering*. Academic Press, 1994.  
5. **BOEHM, B.** "Software Engineering Economics". *IEEE Transactions*, 1984.  
6. **SPOTIFY LABS.** "Scaling Agile @ Spotify". 2017.  
7. **NETFLIX TECH BLOG.** "Chaos Engineering". 2020.  
8. **RUNESON, P. et al.** "Quality Assurance in Software Development". *IEEE TSE*, 2012.  

---

### **Proposta de Apresentação (Slides)**  
**Slide 1:** Título + Contexto Histórico (Mariner 1).  
**Slide 2:** Pilares da SQA (Processos, Métricas, Ferramentas).  
**Slide 3:** Técnicas (Inspeção de Fagan, MBT).  
**Slide 4:** SQA no Ágil vs. DevOps (Spotify, Netflix).  
**Slide 5:** Desafios (Gráfico de custos de defeitos).  
**Slide 6:** Casos Reais (NASA, Spotify).  
**Slide 7:** Futuro (IA, Shift-Left).  
**Slide 8:** Referências.  

--- 