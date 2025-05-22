Sistema de Monitoramento Climático
Visão Geral
Este projeto implementa um sistema de monitoramento climático em Java, utilizando o padrão de projeto Observer (Observador). O sistema permite que estações meteorológicas notifiquem dispositivos de exibição registrados quando novos dados climáticos (temperatura e umidade) são atualizados. O projeto é estruturado em pacotes Java e inclui testes unitários para validar o comportamento do padrão Observer.
O sistema é composto por duas classes principais:

EstaçãoMeteorológica: Representa uma estação meteorológica que atua como o sujeito (Subject) no padrão Observer. Herda de java.util.Observable.
DispositivoExibição: Representa um dispositivo de exibição que atua como observador (Observer). Implementa a interface java.util.Observer.

O projeto também inclui uma suíte de testes unitários para verificar o comportamento do sistema, como notificações de dispositivos individuais, múltiplos dispositivos, dispositivos não registrados e notificações específicas por estação.
Estrutura do Projeto
padroescomportamentais/observer/
├── EstaçãoMeteorológica.java
├── DispositivoExibição.java
├── DispositivoExibiçãoTest.java
└── README.md


EstaçãoMeteorológica.java: Classe que representa uma estação meteorológica, armazenando informações como localização, temperatura, umidade e ID da estação. Possui métodos para atualizar dados climáticos e notificar observadores.
DispositivoExibição.java: Classe que representa um dispositivo de exibição, armazenando o nome do dispositivo e a última notificação recebida. Registra-se em uma estação meteorológica para receber atualizações.
DispositivoExibiçãoTest.java: Contém testes unitários usando JUnit para validar o comportamento do padrão Observer.
README.md: Este arquivo, contendo a documentação do projeto.

Padrão de Projeto Observer
O padrão Observer é utilizado para estabelecer uma relação um-para-muitos entre objetos, onde um sujeito (EstaçãoMeteorológica) notifica seus observadores (DispositivoExibição) sobre mudanças de estado. No contexto deste projeto:

A EstaçãoMeteorológica herda de Observable e notifica os dispositivos quando os dados climáticos são atualizados (via atualizarDadosClimáticos()).
O DispositivoExibição implementa Observer e atualiza sua última notificação quando recebe uma atualização da estação meteorológica à qual está registrado.

Pré-requisitos

Java: Versão 8 ou superior.
JUnit: Versão 5 (Junit Jupiter) para executar os testes unitários.
Maven ou outra ferramenta de build (opcional, para gerenciar dependências).

Como Executar

Clonar o Repositório:git clone <url



