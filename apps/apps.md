###### apps
i. desktop
    ios
    windows
    linux

ii. android
    android
    ios
    windows

    Ionic(d & m)
    flutter(d & m)
    .NET MAUI(d & m)
    NativeScript

Browser
i. Rendering engine(C++) - html/css/js optimization
    
ii. JS engine
iii. network
iv. timer

Rendering engine:
- Load file
- raw bytes to chars utf-8.
- parsing :
    - tokenization
    - an obj for each tag - ex : h1 {tag:h1, title: text ...etc}
    - model from obj and relations
        so called document object model
    - Node list from the hierarchical model
    - Node list is hierarchical 
        also called DOM generation.
    CSS
        - CSSOM CSS Obj Model generation
        - bytes to utf-8 chars; css tokens
        - Obj and relations => CSSOM
        - 
    Render Tree
        - Browser Engine <= (DOM, CSSOM) # links are processed separately
        - generates Render tree from (DOM, CSSOM)
    Painting
        - 
        - no point in loading/rendering Render tree unless Js<script> is loaded as it manipulates Render tree.
        - script/Js takes precedence over Dom and CSSOM gets generated before proc'ing JS
        -  
