package main

import (
	"github.com/pulumi/pulumi-datadog/sdk/v4/go/datadog"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := datadog.NewDashboard(ctx, "ordered_dashboard", &datadog.DashboardArgs{
			Title:       pulumi.String("Ordered Layout Dashboard"),
			Description: pulumi.String("Created using the Datadog provider in Terraform"),
			LayoutType:  pulumi.String("ordered"),
			Widgets: datadog.DashboardWidgetArray{
				&datadog.DashboardWidgetArgs{
					AlertGraphDefinition: &datadog.DashboardWidgetAlertGraphDefinitionArgs{
						AlertId:  pulumi.String("895605"),
						VizType:  pulumi.String("timeseries"),
						Title:    pulumi.String("Widget Title"),
						LiveSpan: pulumi.String("1h"),
					},
				},
				&datadog.DashboardWidgetArgs{
					AlertValueDefinition: &datadog.DashboardWidgetAlertValueDefinitionArgs{
						AlertId:   pulumi.String("895605"),
						Precision: pulumi.Int(3),
						Unit:      pulumi.String("b"),
						TextAlign: pulumi.String("center"),
						Title:     pulumi.String("Widget Title"),
					},
				},
				&datadog.DashboardWidgetArgs{
					AlertValueDefinition: &datadog.DashboardWidgetAlertValueDefinitionArgs{
						AlertId:   pulumi.String("895605"),
						Precision: pulumi.Int(3),
						Unit:      pulumi.String("b"),
						TextAlign: pulumi.String("center"),
						Title:     pulumi.String("Widget Title"),
					},
				},
				&datadog.DashboardWidgetArgs{
					ChangeDefinition: &datadog.DashboardWidgetChangeDefinitionArgs{
						Requests: datadog.DashboardWidgetChangeDefinitionRequestArray{
							&datadog.DashboardWidgetChangeDefinitionRequestArgs{
								Q:            pulumi.String("avg:system.load.1{env:staging} by {account}"),
								ChangeType:   pulumi.String("absolute"),
								CompareTo:    pulumi.String("week_before"),
								IncreaseGood: pulumi.Bool(true),
								OrderBy:      pulumi.String("name"),
								OrderDir:     pulumi.String("desc"),
								ShowPresent:  pulumi.Bool(true),
							},
						},
						Title:    pulumi.String("Widget Title"),
						LiveSpan: pulumi.String("1h"),
					},
				},
				&datadog.DashboardWidgetArgs{
					DistributionDefinition: &datadog.DashboardWidgetDistributionDefinitionArgs{
						Requests: datadog.DashboardWidgetDistributionDefinitionRequestArray{
							&datadog.DashboardWidgetDistributionDefinitionRequestArgs{
								Q: pulumi.String("avg:system.load.1{env:staging} by {account}"),
								Style: &datadog.DashboardWidgetDistributionDefinitionRequestStyleArgs{
									Palette: pulumi.String("warm"),
								},
							},
						},
						Title:    pulumi.String("Widget Title"),
						LiveSpan: pulumi.String("1h"),
					},
				},
				&datadog.DashboardWidgetArgs{
					CheckStatusDefinition: &datadog.DashboardWidgetCheckStatusDefinitionArgs{
						Check:    pulumi.String("aws.ecs.agent_connected"),
						Grouping: pulumi.String("cluster"),
						GroupBies: pulumi.StringArray{
							pulumi.String("account"),
							pulumi.String("cluster"),
						},
						Tags: pulumi.StringArray{
							pulumi.String("account:demo"),
							pulumi.String("cluster:awseb-ruthebdog-env-8-dn3m6u3gvk"),
						},
						Title:    pulumi.String("Widget Title"),
						LiveSpan: pulumi.String("1h"),
					},
				},
				&datadog.DashboardWidgetArgs{
					HeatmapDefinition: &datadog.DashboardWidgetHeatmapDefinitionArgs{
						Requests: datadog.DashboardWidgetHeatmapDefinitionRequestArray{
							&datadog.DashboardWidgetHeatmapDefinitionRequestArgs{
								Q: pulumi.String("avg:system.load.1{env:staging} by {account}"),
								Style: &datadog.DashboardWidgetHeatmapDefinitionRequestStyleArgs{
									Palette: pulumi.String("warm"),
								},
							},
						},
						Yaxis: &datadog.DashboardWidgetHeatmapDefinitionYaxisArgs{
							Min:         pulumi.String("1"),
							Max:         pulumi.String("2"),
							IncludeZero: pulumi.Bool(true),
							Scale:       pulumi.String("sqrt"),
						},
						Title:    pulumi.String("Widget Title"),
						LiveSpan: pulumi.String("1h"),
					},
				},
				&datadog.DashboardWidgetArgs{
					HostmapDefinition: &datadog.DashboardWidgetHostmapDefinitionArgs{
						Request: &datadog.DashboardWidgetHostmapDefinitionRequestArgs{
							Fills: datadog.DashboardWidgetHostmapDefinitionRequestFillArray{
								&datadog.DashboardWidgetHostmapDefinitionRequestFillArgs{
									Q: pulumi.String("avg:system.load.1{*} by {host}"),
								},
							},
							Sizes: datadog.DashboardWidgetHostmapDefinitionRequestSizeArray{
								&datadog.DashboardWidgetHostmapDefinitionRequestSizeArgs{
									Q: pulumi.String("avg:memcache.uptime{*} by {host}"),
								},
							},
						},
						NodeType: pulumi.String("container"),
						Groups: pulumi.StringArray{
							pulumi.String("host"),
							pulumi.String("region"),
						},
						NoGroupHosts:  pulumi.Bool(true),
						NoMetricHosts: pulumi.Bool(true),
						Scopes: pulumi.StringArray{
							pulumi.String("region:us-east-1"),
							pulumi.String("aws_account:727006795293"),
						},
						Style: &datadog.DashboardWidgetHostmapDefinitionStyleArgs{
							Palette:     pulumi.String("yellow_to_green"),
							PaletteFlip: pulumi.Bool(true),
							FillMin:     pulumi.String("10"),
							FillMax:     pulumi.String("20"),
						},
						Title: pulumi.String("Widget Title"),
					},
				},
				&datadog.DashboardWidgetArgs{
					NoteDefinition: &datadog.DashboardWidgetNoteDefinitionArgs{
						Content:         pulumi.String("note text"),
						BackgroundColor: pulumi.String("pink"),
						FontSize:        pulumi.String("14"),
						TextAlign:       pulumi.String("center"),
						ShowTick:        pulumi.Bool(true),
						TickEdge:        pulumi.String("left"),
						TickPos:         pulumi.String("50%"),
					},
				},
				&datadog.DashboardWidgetArgs{
					QueryValueDefinition: &datadog.DashboardWidgetQueryValueDefinitionArgs{
						Requests: datadog.DashboardWidgetQueryValueDefinitionRequestArray{
							&datadog.DashboardWidgetQueryValueDefinitionRequestArgs{
								Q:          pulumi.String("avg:system.load.1{env:staging} by {account}"),
								Aggregator: pulumi.String("sum"),
								ConditionalFormats: datadog.DashboardWidgetQueryValueDefinitionRequestConditionalFormatArray{
									&datadog.DashboardWidgetQueryValueDefinitionRequestConditionalFormatArgs{
										Comparator: pulumi.String("<"),
										Value:      pulumi.Float64(2),
										Palette:    pulumi.String("white_on_green"),
									},
									&datadog.DashboardWidgetQueryValueDefinitionRequestConditionalFormatArgs{
										Comparator: pulumi.String(">"),
										Value:      pulumi.Float64(2.2),
										Palette:    pulumi.String("white_on_red"),
									},
								},
							},
						},
						Autoscale:  pulumi.Bool(true),
						CustomUnit: pulumi.String("xx"),
						Precision:  pulumi.Int(4),
						TextAlign:  pulumi.String("right"),
						Title:      pulumi.String("Widget Title"),
						LiveSpan:   pulumi.String("1h"),
					},
				},
				&datadog.DashboardWidgetArgs{
					QueryTableDefinition: &datadog.DashboardWidgetQueryTableDefinitionArgs{
						Requests: datadog.DashboardWidgetQueryTableDefinitionRequestArray{
							&datadog.DashboardWidgetQueryTableDefinitionRequestArgs{
								Q:          pulumi.String("avg:system.load.1{env:staging} by {account}"),
								Aggregator: pulumi.String("sum"),
								Limit:      pulumi.Int(10),
								ConditionalFormats: datadog.DashboardWidgetQueryTableDefinitionRequestConditionalFormatArray{
									&datadog.DashboardWidgetQueryTableDefinitionRequestConditionalFormatArgs{
										Comparator: pulumi.String("<"),
										Value:      pulumi.Float64(2),
										Palette:    pulumi.String("white_on_green"),
									},
									&datadog.DashboardWidgetQueryTableDefinitionRequestConditionalFormatArgs{
										Comparator: pulumi.String(">"),
										Value:      pulumi.Float64(2.2),
										Palette:    pulumi.String("white_on_red"),
									},
								},
							},
						},
						Title:    pulumi.String("Widget Title"),
						LiveSpan: pulumi.String("1h"),
					},
				},
				&datadog.DashboardWidgetArgs{
					ScatterplotDefinition: &datadog.DashboardWidgetScatterplotDefinitionArgs{
						Request: &datadog.DashboardWidgetScatterplotDefinitionRequestArgs{
							Xes: datadog.DashboardWidgetScatterplotDefinitionRequestXArray{
								&datadog.DashboardWidgetScatterplotDefinitionRequestXArgs{
									Q:          pulumi.String("avg:system.cpu.user{*} by {service, account}"),
									Aggregator: pulumi.String("max"),
								},
							},
							Ys: datadog.DashboardWidgetScatterplotDefinitionRequestYArray{
								&datadog.DashboardWidgetScatterplotDefinitionRequestYArgs{
									Q:          pulumi.String("avg:system.mem.used{*} by {service, account}"),
									Aggregator: pulumi.String("min"),
								},
							},
						},
						ColorByGroups: pulumi.StringArray{
							pulumi.String("account"),
							pulumi.String("apm-role-group"),
						},
						Xaxis: &datadog.DashboardWidgetScatterplotDefinitionXaxisArgs{
							IncludeZero: pulumi.Bool(true),
							Label:       pulumi.String("x"),
							Min:         pulumi.String("1"),
							Max:         pulumi.String("2000"),
							Scale:       pulumi.String("pow"),
						},
						Yaxis: &datadog.DashboardWidgetScatterplotDefinitionYaxisArgs{
							IncludeZero: pulumi.Bool(false),
							Label:       pulumi.String("y"),
							Min:         pulumi.String("5"),
							Max:         pulumi.String("2222"),
							Scale:       pulumi.String("log"),
						},
						Title:    pulumi.String("Widget Title"),
						LiveSpan: pulumi.String("1h"),
					},
				},
				&datadog.DashboardWidgetArgs{
					ServicemapDefinition: &datadog.DashboardWidgetServicemapDefinitionArgs{
						Service: pulumi.String("master-db"),
						Filters: pulumi.StringArray{
							pulumi.String("env:prod"),
							pulumi.String("datacenter:dc1"),
						},
						Title:      pulumi.String("env: prod, datacenter:dc1, service: master-db"),
						TitleSize:  pulumi.String("16"),
						TitleAlign: pulumi.String("left"),
					},
				},
				&datadog.DashboardWidgetArgs{
					TimeseriesDefinition: &datadog.DashboardWidgetTimeseriesDefinitionArgs{
						Requests: datadog.DashboardWidgetTimeseriesDefinitionRequestArray{
							&datadog.DashboardWidgetTimeseriesDefinitionRequestArgs{
								Q:           pulumi.String("avg:system.cpu.user{app:general} by {env}"),
								DisplayType: pulumi.String("line"),
								Style: &datadog.DashboardWidgetTimeseriesDefinitionRequestStyleArgs{
									Palette:   pulumi.String("warm"),
									LineType:  pulumi.String("dashed"),
									LineWidth: pulumi.String("thin"),
								},
								Metadatas: datadog.DashboardWidgetTimeseriesDefinitionRequestMetadataArray{
									&datadog.DashboardWidgetTimeseriesDefinitionRequestMetadataArgs{
										Expression: pulumi.String("avg:system.cpu.user{app:general} by {env}"),
										AliasName:  pulumi.String("Alpha"),
									},
								},
							},
							&datadog.DashboardWidgetTimeseriesDefinitionRequestArgs{
								LogQuery: &datadog.DashboardWidgetLogQueryArgs{
									Index: pulumi.String("mcnulty"),
									ComputeQuery: &datadog.DashboardWidgetLogQueryComputeQueryArgs{
										Aggregation: pulumi.String("avg"),
										Facet:       pulumi.String("@duration"),
										Interval:    pulumi.Int(5000),
									},
									SearchQuery: pulumi.String("status:info"),
									GroupBies: datadog.DashboardWidgetLogQueryGroupByArray{
										&datadog.DashboardWidgetLogQueryGroupByArgs{
											Facet: pulumi.String("host"),
											Limit: pulumi.Int(10),
											SortQuery: &datadog.DashboardWidgetLogQueryGroupBySortQueryArgs{
												Aggregation: pulumi.String("avg"),
												Order:       pulumi.String("desc"),
												Facet:       pulumi.String("@duration"),
											},
										},
									},
								},
								DisplayType: pulumi.String("area"),
							},
							&datadog.DashboardWidgetTimeseriesDefinitionRequestArgs{
								ApmQuery: &datadog.DashboardWidgetApmQueryArgs{
									Index: pulumi.String("apm-search"),
									ComputeQuery: &datadog.DashboardWidgetApmQueryComputeQueryArgs{
										Aggregation: pulumi.String("avg"),
										Facet:       pulumi.String("@duration"),
										Interval:    pulumi.Int(5000),
									},
									SearchQuery: pulumi.String("type:web"),
									GroupBies: datadog.DashboardWidgetApmQueryGroupByArray{
										&datadog.DashboardWidgetApmQueryGroupByArgs{
											Facet: pulumi.String("resource_name"),
											Limit: pulumi.Int(50),
											SortQuery: &datadog.DashboardWidgetApmQueryGroupBySortQueryArgs{
												Aggregation: pulumi.String("avg"),
												Order:       pulumi.String("desc"),
												Facet:       pulumi.String("@string_query.interval"),
											},
										},
									},
								},
								DisplayType: pulumi.String("bars"),
							},
							&datadog.DashboardWidgetTimeseriesDefinitionRequestArgs{
								ProcessQuery: &datadog.DashboardWidgetTimeseriesDefinitionRequestProcessQueryArgs{
									Metric:   pulumi.String("process.stat.cpu.total_pct"),
									SearchBy: pulumi.String("error"),
									FilterBies: pulumi.StringArray{
										pulumi.String("active"),
									},
									Limit: pulumi.Int(50),
								},
								DisplayType: pulumi.String("area"),
							},
						},
						Markers: datadog.DashboardWidgetTimeseriesDefinitionMarkerArray{
							&datadog.DashboardWidgetTimeseriesDefinitionMarkerArgs{
								DisplayType: pulumi.String("error dashed"),
								Label:       pulumi.String(" z=6 "),
								Value:       pulumi.String("y = 4"),
							},
							&datadog.DashboardWidgetTimeseriesDefinitionMarkerArgs{
								DisplayType: pulumi.String("ok solid"),
								Value:       pulumi.String("10 < y < 999"),
								Label:       pulumi.String(" x=8 "),
							},
						},
						Title:      pulumi.String("Widget Title"),
						ShowLegend: pulumi.Bool(true),
						LegendSize: pulumi.String("2"),
						LiveSpan:   pulumi.String("1h"),
						Events: datadog.DashboardWidgetTimeseriesDefinitionEventArray{
							&datadog.DashboardWidgetTimeseriesDefinitionEventArgs{
								Q: pulumi.String("sources:test tags:1"),
							},
							&datadog.DashboardWidgetTimeseriesDefinitionEventArgs{
								Q: pulumi.String("sources:test tags:2"),
							},
						},
						Yaxis: &datadog.DashboardWidgetTimeseriesDefinitionYaxisArgs{
							Scale:       pulumi.String("log"),
							IncludeZero: pulumi.Bool(false),
							Max:         pulumi.String("100"),
						},
					},
				},
				&datadog.DashboardWidgetArgs{
					ToplistDefinition: &datadog.DashboardWidgetToplistDefinitionArgs{
						Requests: datadog.DashboardWidgetToplistDefinitionRequestArray{
							&datadog.DashboardWidgetToplistDefinitionRequestArgs{
								Q: pulumi.String("avg:system.cpu.user{app:general} by {env}"),
								ConditionalFormats: datadog.DashboardWidgetToplistDefinitionRequestConditionalFormatArray{
									&datadog.DashboardWidgetToplistDefinitionRequestConditionalFormatArgs{
										Comparator: pulumi.String("<"),
										Value:      pulumi.Float64(2),
										Palette:    pulumi.String("white_on_green"),
									},
									&datadog.DashboardWidgetToplistDefinitionRequestConditionalFormatArgs{
										Comparator: pulumi.String(">"),
										Value:      pulumi.Float64(2.2),
										Palette:    pulumi.String("white_on_red"),
									},
								},
							},
						},
						Title: pulumi.String("Widget Title"),
					},
				},
				&datadog.DashboardWidgetArgs{
					GroupDefinition: &datadog.DashboardWidgetGroupDefinitionArgs{
						LayoutType: pulumi.String("ordered"),
						Title:      pulumi.String("Group Widget"),
						Widgets: datadog.DashboardWidgetGroupDefinitionWidgetArray{
							&datadog.DashboardWidgetGroupDefinitionWidgetArgs{
								NoteDefinition: &datadog.DashboardWidgetNoteDefinitionArgs{
									Content:         pulumi.String("cluster note widget"),
									BackgroundColor: pulumi.String("pink"),
									FontSize:        pulumi.String("14"),
									TextAlign:       pulumi.String("center"),
									ShowTick:        pulumi.Bool(true),
									TickEdge:        pulumi.String("left"),
									TickPos:         pulumi.String("50%"),
								},
							},
							&datadog.DashboardWidgetGroupDefinitionWidgetArgs{
								AlertGraphDefinition: &datadog.DashboardWidgetAlertGraphDefinitionArgs{
									AlertId:  pulumi.String("123"),
									VizType:  pulumi.String("toplist"),
									Title:    pulumi.String("Alert Graph"),
									LiveSpan: pulumi.String("1h"),
								},
							},
						},
					},
				},
				&datadog.DashboardWidgetArgs{
					ServiceLevelObjectiveDefinition: &datadog.DashboardWidgetServiceLevelObjectiveDefinitionArgs{
						Title:           pulumi.String("Widget Title"),
						ViewType:        pulumi.String("detail"),
						SloId:           pulumi.String("56789"),
						ShowErrorBudget: pulumi.Bool(true),
						ViewMode:        pulumi.String("overall"),
						TimeWindows: pulumi.StringArray{
							pulumi.String("7d"),
							pulumi.String("previous_week"),
						},
					},
				},
			},
			TemplateVariables: datadog.DashboardTemplateVariableArray{
				&datadog.DashboardTemplateVariableArgs{
					Name:    pulumi.String("var_1"),
					Prefix:  pulumi.String("host"),
					Default: pulumi.String("aws"),
				},
				&datadog.DashboardTemplateVariableArgs{
					Name:    pulumi.String("var_2"),
					Prefix:  pulumi.String("service_name"),
					Default: pulumi.String("autoscaling"),
				},
			},
			TemplateVariablePresets: datadog.DashboardTemplateVariablePresetArray{
				&datadog.DashboardTemplateVariablePresetArgs{
					Name: pulumi.String("preset_1"),
					TemplateVariables: datadog.DashboardTemplateVariablePresetTemplateVariableArray{
						&datadog.DashboardTemplateVariablePresetTemplateVariableArgs{
							Name:  pulumi.String("var_1"),
							Value: pulumi.String("host.dc"),
						},
						&datadog.DashboardTemplateVariablePresetTemplateVariableArgs{
							Name:  pulumi.String("var_2"),
							Value: pulumi.String("my_service"),
						},
					},
				},
			},
		})
		if err != nil {
			return err
		}
		_, err = datadog.NewDashboard(ctx, "free_dashboard", &datadog.DashboardArgs{
			Title:       pulumi.String("Free Layout Dashboard"),
			Description: pulumi.String("Created using the Datadog provider in Terraform"),
			LayoutType:  pulumi.String("free"),
			Widgets: datadog.DashboardWidgetArray{
				&datadog.DashboardWidgetArgs{
					EventStreamDefinition: &datadog.DashboardWidgetEventStreamDefinitionArgs{
						Query:      pulumi.String("*"),
						EventSize:  pulumi.String("l"),
						Title:      pulumi.String("Widget Title"),
						TitleSize:  pulumi.String("16"),
						TitleAlign: pulumi.String("left"),
						LiveSpan:   pulumi.String("1h"),
					},
					WidgetLayout: &datadog.DashboardWidgetWidgetLayoutArgs{
						Height: pulumi.Int(43),
						Width:  pulumi.Int(32),
						X:      pulumi.Int(0),
						Y:      pulumi.Int(0),
					},
				},
				&datadog.DashboardWidgetArgs{
					EventTimelineDefinition: &datadog.DashboardWidgetEventTimelineDefinitionArgs{
						Query:      pulumi.String("*"),
						Title:      pulumi.String("Widget Title"),
						TitleSize:  pulumi.String("16"),
						TitleAlign: pulumi.String("left"),
						LiveSpan:   pulumi.String("1h"),
					},
					WidgetLayout: &datadog.DashboardWidgetWidgetLayoutArgs{
						Height: pulumi.Int(9),
						Width:  pulumi.Int(66),
						X:      pulumi.Int(33),
						Y:      pulumi.Int(60),
					},
				},
				&datadog.DashboardWidgetArgs{
					FreeTextDefinition: &datadog.DashboardWidgetFreeTextDefinitionArgs{
						Text:      pulumi.String("free text content"),
						Color:     pulumi.String("#d00"),
						FontSize:  pulumi.String("36"),
						TextAlign: pulumi.String("left"),
					},
					WidgetLayout: &datadog.DashboardWidgetWidgetLayoutArgs{
						Height: pulumi.Int(20),
						Width:  pulumi.Int(34),
						X:      pulumi.Int(33),
						Y:      pulumi.Int(0),
					},
				},
				&datadog.DashboardWidgetArgs{
					IframeDefinition: &datadog.DashboardWidgetIframeDefinitionArgs{
						Url: pulumi.String("http://google.com"),
					},
					WidgetLayout: &datadog.DashboardWidgetWidgetLayoutArgs{
						Height: pulumi.Int(46),
						Width:  pulumi.Int(39),
						X:      pulumi.Int(101),
						Y:      pulumi.Int(0),
					},
				},
				&datadog.DashboardWidgetArgs{
					ImageDefinition: &datadog.DashboardWidgetImageDefinitionArgs{
						Url:    pulumi.String("https://images.pexels.com/photos/67636/rose-blue-flower-rose-blooms-67636.jpeg?auto=compress&cs=tinysrgb&h=350"),
						Sizing: pulumi.String("fit"),
						Margin: pulumi.String("small"),
					},
					WidgetLayout: &datadog.DashboardWidgetWidgetLayoutArgs{
						Height: pulumi.Int(20),
						Width:  pulumi.Int(30),
						X:      pulumi.Int(69),
						Y:      pulumi.Int(0),
					},
				},
				&datadog.DashboardWidgetArgs{
					LogStreamDefinition: &datadog.DashboardWidgetLogStreamDefinitionArgs{
						Indexes: pulumi.StringArray{
							pulumi.String("main"),
						},
						Query: pulumi.String("error"),
						Columns: pulumi.StringArray{
							pulumi.String("core_host"),
							pulumi.String("core_service"),
							pulumi.String("tag_source"),
						},
						ShowDateColumn:    pulumi.Bool(true),
						ShowMessageColumn: pulumi.Bool(true),
						MessageDisplay:    pulumi.String("expanded-md"),
						Sort: &datadog.DashboardWidgetLogStreamDefinitionSortArgs{
							Column: pulumi.String("time"),
							Order:  pulumi.String("desc"),
						},
					},
					WidgetLayout: &datadog.DashboardWidgetWidgetLayoutArgs{
						Height: pulumi.Int(36),
						Width:  pulumi.Int(32),
						X:      pulumi.Int(0),
						Y:      pulumi.Int(45),
					},
				},
				&datadog.DashboardWidgetArgs{
					ManageStatusDefinition: &datadog.DashboardWidgetManageStatusDefinitionArgs{
						ColorPreference:   pulumi.String("text"),
						DisplayFormat:     pulumi.String("countsAndList"),
						HideZeroCounts:    pulumi.Bool(true),
						Query:             pulumi.String("type:metric"),
						ShowLastTriggered: pulumi.Bool(false),
						Sort:              pulumi.String("status,asc"),
						SummaryType:       pulumi.String("monitors"),
						Title:             pulumi.String("Widget Title"),
						TitleSize:         pulumi.String("16"),
						TitleAlign:        pulumi.String("left"),
					},
					WidgetLayout: &datadog.DashboardWidgetWidgetLayoutArgs{
						Height: pulumi.Int(40),
						Width:  pulumi.Int(30),
						X:      pulumi.Int(101),
						Y:      pulumi.Int(48),
					},
				},
				&datadog.DashboardWidgetArgs{
					TraceServiceDefinition: &datadog.DashboardWidgetTraceServiceDefinitionArgs{
						DisplayFormat:    pulumi.String("three_column"),
						Env:              pulumi.String("datadog.com"),
						Service:          pulumi.String("alerting-cassandra"),
						ShowBreakdown:    pulumi.Bool(true),
						ShowDistribution: pulumi.Bool(true),
						ShowErrors:       pulumi.Bool(true),
						ShowHits:         pulumi.Bool(true),
						ShowLatency:      pulumi.Bool(false),
						ShowResourceList: pulumi.Bool(false),
						SizeFormat:       pulumi.String("large"),
						SpanName:         pulumi.String("cassandra.query"),
						Title:            pulumi.String("alerting-cassandra #env:datadog.com"),
						TitleAlign:       pulumi.String("center"),
						TitleSize:        pulumi.String("13"),
						LiveSpan:         pulumi.String("1h"),
					},
					WidgetLayout: &datadog.DashboardWidgetWidgetLayoutArgs{
						Height: pulumi.Int(38),
						Width:  pulumi.Int(66),
						X:      pulumi.Int(33),
						Y:      pulumi.Int(21),
					},
				},
				&datadog.DashboardWidgetArgs{
					TimeseriesDefinition: &datadog.DashboardWidgetTimeseriesDefinitionArgs{
						Requests: datadog.DashboardWidgetTimeseriesDefinitionRequestArray{
							&datadog.DashboardWidgetTimeseriesDefinitionRequestArgs{
								Formulas: datadog.DashboardWidgetTimeseriesDefinitionRequestFormulaArray{
									&datadog.DashboardWidgetTimeseriesDefinitionRequestFormulaArgs{
										FormulaExpression: pulumi.String("my_query_1 + my_query_2"),
										Alias:             pulumi.String("my ff query"),
									},
									&datadog.DashboardWidgetTimeseriesDefinitionRequestFormulaArgs{
										FormulaExpression: pulumi.String("my_query_1 * my_query_2"),
										Limit: &datadog.DashboardWidgetTimeseriesDefinitionRequestFormulaLimitArgs{
											Count: pulumi.Int(5),
											Order: pulumi.String("desc"),
										},
										Alias: pulumi.String("my second ff query"),
									},
								},
								Queries: datadog.DashboardWidgetTimeseriesDefinitionRequestQueryArray{
									&datadog.DashboardWidgetTimeseriesDefinitionRequestQueryArgs{
										MetricQuery: &datadog.DashboardWidgetTimeseriesDefinitionRequestQueryMetricQueryArgs{
											DataSource: pulumi.String("metrics"),
											Query:      pulumi.String("avg:system.cpu.user{app:general} by {env}"),
											Name:       pulumi.String("my_query_1"),
											Aggregator: pulumi.String("sum"),
										},
									},
									&datadog.DashboardWidgetTimeseriesDefinitionRequestQueryArgs{
										MetricQuery: &datadog.DashboardWidgetTimeseriesDefinitionRequestQueryMetricQueryArgs{
											Query:      pulumi.String("avg:system.cpu.user{app:general} by {env}"),
											Name:       pulumi.String("my_query_2"),
											Aggregator: pulumi.String("sum"),
										},
									},
								},
							},
						},
					},
					WidgetLayout: &datadog.DashboardWidgetWidgetLayoutArgs{
						Height: pulumi.Int(16),
						Width:  pulumi.Int(25),
						X:      pulumi.Int(58),
						Y:      pulumi.Int(83),
					},
				},
				&datadog.DashboardWidgetArgs{
					TimeseriesDefinition: &datadog.DashboardWidgetTimeseriesDefinitionArgs{
						Requests: datadog.DashboardWidgetTimeseriesDefinitionRequestArray{
							&datadog.DashboardWidgetTimeseriesDefinitionRequestArgs{
								Queries: datadog.DashboardWidgetTimeseriesDefinitionRequestQueryArray{
									&datadog.DashboardWidgetTimeseriesDefinitionRequestQueryArgs{
										EventQuery: &datadog.DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryArgs{
											Name:       pulumi.String("my-query"),
											DataSource: pulumi.String("logs"),
											Indexes: pulumi.StringArray{
												pulumi.String("days-3"),
											},
											Computes: datadog.DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryComputeArray{
												&datadog.DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryComputeArgs{
													Aggregation: pulumi.String("count"),
												},
											},
											GroupBies: datadog.DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryGroupByArray{
												&datadog.DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryGroupByArgs{
													Facet: pulumi.String("host"),
													Sort: &datadog.DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryGroupBySortArgs{
														Metric:      pulumi.String("@lambda.max_memory_used"),
														Aggregation: pulumi.String("avg"),
													},
													Limit: pulumi.Int(10),
												},
											},
										},
									},
								},
							},
							&datadog.DashboardWidgetTimeseriesDefinitionRequestArgs{
								DisplayType: pulumi.String("overlay"),
								Queries: datadog.DashboardWidgetTimeseriesDefinitionRequestQueryArray{
									&datadog.DashboardWidgetTimeseriesDefinitionRequestQueryArgs{
										MetricQuery: &datadog.DashboardWidgetTimeseriesDefinitionRequestQueryMetricQueryArgs{
											Name:       pulumi.String("MyOverlay"),
											DataSource: pulumi.String("metrics"),
											Query:      pulumi.String("avg:system.cpu.user{host:COMP-QJWVM2FYT4}"),
										},
									},
								},
							},
						},
					},
					WidgetLayout: &datadog.DashboardWidgetWidgetLayoutArgs{
						Height: pulumi.Int(16),
						Width:  pulumi.Int(28),
						X:      pulumi.Int(29),
						Y:      pulumi.Int(83),
					},
				},
				&datadog.DashboardWidgetArgs{
					TimeseriesDefinition: &datadog.DashboardWidgetTimeseriesDefinitionArgs{
						Requests: datadog.DashboardWidgetTimeseriesDefinitionRequestArray{
							&datadog.DashboardWidgetTimeseriesDefinitionRequestArgs{
								Queries: datadog.DashboardWidgetTimeseriesDefinitionRequestQueryArray{
									&datadog.DashboardWidgetTimeseriesDefinitionRequestQueryArgs{
										ProcessQuery: &datadog.DashboardWidgetTimeseriesDefinitionRequestQueryProcessQueryArgs{
											DataSource: pulumi.String("process"),
											TextFilter: pulumi.String("abc"),
											Metric:     pulumi.String("process.stat.cpu.total_pct"),
											Limit:      pulumi.Int(10),
											TagFilters: pulumi.StringArray{
												pulumi.String("some_filter"),
											},
											Name:            pulumi.String("my_process_query"),
											Sort:            pulumi.String("asc"),
											IsNormalizedCpu: pulumi.Bool(true),
											Aggregator:      pulumi.String("sum"),
										},
									},
								},
							},
						},
					},
					WidgetLayout: &datadog.DashboardWidgetWidgetLayoutArgs{
						Height: pulumi.Int(16),
						Width:  pulumi.Int(28),
						X:      pulumi.Int(0),
						Y:      pulumi.Int(83),
					},
				},
				&datadog.DashboardWidgetArgs{
					TimeseriesDefinition: &datadog.DashboardWidgetTimeseriesDefinitionArgs{
						Requests: datadog.DashboardWidgetTimeseriesDefinitionRequestArray{
							&datadog.DashboardWidgetTimeseriesDefinitionRequestArgs{
								Formulas: datadog.DashboardWidgetTimeseriesDefinitionRequestFormulaArray{
									&datadog.DashboardWidgetTimeseriesDefinitionRequestFormulaArgs{
										FormulaExpression: pulumi.String("query1"),
										Alias:             pulumi.String("my cloud cost query"),
									},
								},
								Queries: datadog.DashboardWidgetTimeseriesDefinitionRequestQueryArray{
									&datadog.DashboardWidgetTimeseriesDefinitionRequestQueryArgs{
										CloudCostQuery: &datadog.DashboardWidgetTimeseriesDefinitionRequestQueryCloudCostQueryArgs{
											DataSource: pulumi.String("cloud_cost"),
											Query:      pulumi.String("sum:aws.cost.amortized{*}"),
											Name:       pulumi.String("query1"),
											Aggregator: pulumi.String("sum"),
										},
									},
								},
							},
						},
					},
				},
				&datadog.DashboardWidgetArgs{
					PowerpackDefinition: &datadog.DashboardWidgetPowerpackDefinitionArgs{
						PowerpackId:     pulumi.String("00000000-0000-0000-0000-000000000000"),
						BackgroundColor: pulumi.String("blue"),
						BannerImg:       pulumi.String("https://example.org/example.png"),
						ShowTitle:       pulumi.Bool(true),
						Title:           pulumi.String("Powerpack Widget"),
						TemplateVariables: &datadog.DashboardWidgetPowerpackDefinitionTemplateVariablesArgs{
							ControlledExternallies: datadog.DashboardWidgetPowerpackDefinitionTemplateVariablesControlledExternallyArray{
								&datadog.DashboardWidgetPowerpackDefinitionTemplateVariablesControlledExternallyArgs{
									Name: pulumi.String("var_2"),
									Values: pulumi.StringArray{
										pulumi.String("autoscaling"),
									},
									Prefix: pulumi.String("service_name"),
								},
							},
							ControlledByPowerpacks: datadog.DashboardWidgetPowerpackDefinitionTemplateVariablesControlledByPowerpackArray{
								&datadog.DashboardWidgetPowerpackDefinitionTemplateVariablesControlledByPowerpackArgs{
									Name:   pulumi.String("var_3"),
									Prefix: pulumi.String("timeframe"),
									Values: pulumi.StringArray{
										pulumi.String("default"),
										pulumi.String("values"),
										pulumi.String("here"),
									},
								},
							},
						},
					},
				},
			},
			TemplateVariables: datadog.DashboardTemplateVariableArray{
				&datadog.DashboardTemplateVariableArgs{
					Name:    pulumi.String("var_1"),
					Prefix:  pulumi.String("host"),
					Default: pulumi.String("aws"),
				},
				&datadog.DashboardTemplateVariableArgs{
					Name:    pulumi.String("var_2"),
					Prefix:  pulumi.String("service_name"),
					Default: pulumi.String("autoscaling"),
				},
			},
			TemplateVariablePresets: datadog.DashboardTemplateVariablePresetArray{
				&datadog.DashboardTemplateVariablePresetArgs{
					Name: pulumi.String("preset_1"),
					TemplateVariables: datadog.DashboardTemplateVariablePresetTemplateVariableArray{
						&datadog.DashboardTemplateVariablePresetTemplateVariableArgs{
							Name:  pulumi.String("var_1"),
							Value: pulumi.String("host.dc"),
						},
						&datadog.DashboardTemplateVariablePresetTemplateVariableArgs{
							Name:  pulumi.String("var_2"),
							Value: pulumi.String("my_service"),
						},
					},
				},
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
