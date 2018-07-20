# demo
## Entry Components
To contrast the two types of components, there are components which are included in the template, which are _declarative_. 
Additionally, there are components which you load _imperatively_; that is, entry components. You specify an entry component 
by bootstrapping it in an NgModule, or including it in a routing definition.
### A bootstrapped entry component
The following is an example of specifying a bootstrapped component, AppComponent, in a basic app.module.ts:


```javascript
@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent] // bootstrapped entry component
})
```

dfdf
