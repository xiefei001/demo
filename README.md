# demo
## Entry Components
To contrast the two types of components, there are components which are included in the template, which are _declarative_. 
Additionally, there are components which you load _imperatively_; that is, entry components. You specify an entry component 
by bootstrapping it in an NgModule, or including it in a routing definition.
### A bootstrapped entry component
The following is an example of specifying a bootstrapped component, _AppComponent_, in a basic app.module.ts:


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
A bootstrapped component is an entry component that Angular loads into the DOM during the bootstrap process 
(application launch). Angular loads a root AppComponent dynamically because it's listed by type in 
@NgModule.bootstrap.
### A routed entry component
The second kind of entry component occurs in a route definition like this:
```javascript
const routes: Routes = [
  {
    path: '',
    component: CustomerListComponent
  }
];
```
