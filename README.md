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

A route definition refers to a component by its type with component: _CustomerListComponent_.

All router components must be entry components. Because this would require you to add the component in two places 
(router and entryComponents) the Compiler is smart enough to recognize that this is a router definition and 
automatically add the router component into entryComponents.

Though the @NgModule decorator has an entryComponents array, most of the time you won't have to explicitly set any 
entry components because Angular adds components listed in @NgModule.bootstrap and those in route definitions to 
entry components automatically. Though these two mechanisms account for most entry components, if your app happens 
to bootstrap or dynamically load a component by type imperatively, you must add it to entryComponents explicitly.

### Tree shaker
the Angular compiler only generates code for components which are reachable from the entryComponents; This means that adding more references to @NgModule.declarations does not imply that they will necessarily be included in the final bundle.

In fact, many libraries declare and export components you'll never use. For the ones you don't reference, the tree 
shaker drops these components from the final code package. If a component isn't an entry component and isn't found in a template, the tree shaker will throw it away. 





