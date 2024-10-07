###### Critical Rendering Path (CRP)
sequence of steps browser goes through to convert html, css, Js into pixels on the screen.

###### Render Blocking CSS
- CSS RB by default


- (DOM, CSSOM) => render tree
- selector for each DOM property and calc styles for them
- Render tree - what elements should be rendered on the screen and what styles should be applied to them.
-  Layout - calc position and dimension of each ele.
- Paint - each units are converted into absolute units - pixels and drawn in the screen one by one called paint.
- Update layer tree
- Composite - app can have multiple layers and browser can handle these layers separately - the proc of handling these layers - compositing layers.
- Frame - frame on the screen
- JS - 

JS >> Style/Render tree >> Layout/reflow >> paint >> Composite >> Frame


###### Style calc
- conversion
- Tokenizing
- Lexing - tokens to Node
- DOM tree - hierarchical tree of html

 default CSS:
 - Conversion
 - Tokenizing
 - Lexing
 - CSSOM

Render tree
 Combine DOM + CSSOM
 - selector matching
 - figure out final styles
 - Render tree looks similar to DOM tree except the ele with display none are removed
    - each Node contains the styles along with html properties
 - only visible ele exist in the tree
 - Commit


 Demo
 - 


 ###### Render Blocking Resources










